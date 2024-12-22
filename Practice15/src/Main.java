import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Выбор страны");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        JLabel infoLabel = new JLabel("Выберите страну для доп информации");
        infoLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        String[] countries = {"Австралия", "Китай", "Германия", "Россия"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);
        countryComboBox.setSelectedIndex(-1);


        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedCountry = (String) countryComboBox.getSelectedItem();

                switch (selectedCountry) {
                    case "Австралия":
                        infoLabel.setText("Страна-материк");
                        break;
                    case "Китай":
                        infoLabel.setText("Самая густонаселенная страна");
                        break;
                    case "Германия":
                        infoLabel.setText("Здесь отлично развит автопром");
                        break;
                    case "Россия":
                        infoLabel.setText("Самая большая страна");
                        break;
                }
            }
        });


        frame.add(new JLabel("Выберите страну:"));
        frame.add(countryComboBox);
        frame.add(infoLabel);

        frame.setVisible(true);
    }
}
