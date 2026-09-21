import javax.swing.*;
import java.awt.FlowLayout;

public class GUICalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Calculator");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label1 = new JLabel("Num 1:");
        JTextField text1 = new JTextField(8);

        JLabel label2 = new JLabel("Num 2:");
        JTextField text2 = new JTextField(8);

        JButton addBtn = new JButton("Add");
        JButton subBtn = new JButton("Subtract");

        JLabel resultLabel = new JLabel("Result: ");

        addBtn.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double result = num1 + num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Error: Enter valid numbers");
            }
        });

        subBtn.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(text1.getText());
                double num2 = Double.parseDouble(text2.getText());
                double result = num1 - num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Error: Enter valid numbers");
            }
        });

        frame.add(label1);
        frame.add(text1);
        frame.add(label2);
        frame.add(text2);
        frame.add(addBtn);
        frame.add(subBtn);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}