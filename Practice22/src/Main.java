import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Общая модель калькулятора
class CalculatorModel {
    private double result = 0;
    private String operator = "";
    private boolean isNewOperand = true;

    public double getResult() {
        return result;
    }

    public void setOperand(double operand) {
        if (isNewOperand) {
            result = operand;
            isNewOperand = false;
        } else {
            calculate(operand);
        }
    }

    public void setOperator(String operator) {
        this.operator = operator;
        isNewOperand = true;
    }

    public void clear() {
        result = 0;
        operator = "";
        isNewOperand = true;
    }

    private void calculate(double operand) {
        switch (operator) {
            case "+":
                result += operand;
                break;
            case "-":
                result -= operand;
                break;
            case "*":
                result *= operand;
                break;
            case "/":
                if (operand != 0) {
                    result /= operand;
                } else {
                    throw new ArithmeticException("Деление на 0!");
                }
                break;
        }
    }
}

// View: Handles the GUI
class CalculatorView extends JFrame {
    private JTextField displayField = new JTextField();
    private JPanel buttonPanel = new JPanel();
    private JButton[] buttons = new JButton[16];
    private String[] labels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
    };

    public CalculatorView() {
        setTitle("Мой калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display Field
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        // Buttons
        buttonPanel.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(labels[i]);
            buttonPanel.add(buttons[i]);
        }
        add(buttonPanel, BorderLayout.CENTER);

        setSize(300, 400);
        setVisible(true);
    }

    public String getDisplayText() {
        return displayField.getText();
    }

    public void setDisplayText(String text) {
        displayField.setText(text);
    }

    public void addButtonListener(ActionListener listener) {
        for (JButton button : buttons) {
            button.addActionListener(listener);
        }
    }
}

// Controller: Handles interaction between View and Model
class CalculatorController {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;

        // Add listeners
        view.addButtonListener(new ButtonClickListener());
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();

            try {
                if ("0123456789".contains(command)) {
                    view.setDisplayText(view.getDisplayText() + command);
                } else if ("/+-*".contains(command)) {
                    model.setOperand(Double.parseDouble(view.getDisplayText()));
                    model.setOperator(command);
                    view.setDisplayText("");
                } else if (command.equals("=")) {
                    model.setOperand(Double.parseDouble(view.getDisplayText()));
                    view.setDisplayText(String.valueOf(model.getResult()));
                } else if (command.equals("C")) {
                    model.clear();
                    view.setDisplayText("");
                }
            } catch (Exception ex) {
                view.setDisplayText("Ошибка");
                model.clear();
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        new CalculatorController(view, model);
    }
}
