import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Простейший редактор текста"); //Создание JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create JTextArea
        JTextArea textArea = new JTextArea();
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Create JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // Create "Color" menu
        JMenu colorMenu = new JMenu("Цвет");
        JMenuItem blueColor = new JMenuItem("Синий");
        JMenuItem redColor = new JMenuItem("Красный");
        JMenuItem blackColor = new JMenuItem("Черный");

        blueColor.addActionListener(e -> textArea.setForeground(Color.BLUE));
        redColor.addActionListener(e -> textArea.setForeground(Color.RED));
        blackColor.addActionListener(e -> textArea.setForeground(Color.BLACK));
        colorMenu.add(blueColor);
        colorMenu.add(redColor);
        colorMenu.add(blackColor);

        //Создание Front
        JMenu fontMenu = new JMenu("Текст");
        JMenuItem timesNewRoman = new JMenuItem("Times New Roman");
        JMenuItem msSansSerif = new JMenuItem("MS Sans Serif");
        JMenuItem courierNew = new JMenuItem("Courier New");

        timesNewRoman.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16)));
        msSansSerif.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 16)));
        courierNew.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 16)));

        fontMenu.add(timesNewRoman);
        fontMenu.add(msSansSerif);
        fontMenu.add(courierNew);

        menuBar.add(colorMenu);
        menuBar.add(fontMenu);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
