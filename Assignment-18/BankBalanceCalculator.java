import javax.swing.*;
import java.awt.FlowLayout;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Bank Balance Calculator");
        frame.setLayout(new FlowLayout());
        frame.setSize(350, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel balanceInputLabel = new JLabel("Initial Balance:");
        JTextField balanceField = new JTextField(10);
        JButton setBalanceBtn = new JButton("Set Initial Balance");

        JLabel amountLabel = new JLabel("Transaction Amount:");
        JTextField amountField = new JTextField(10);

        JButton depositBtn = new JButton("Deposit (+)");
        JButton withdrawBtn = new JButton("Withdraw (-)");

        JLabel currentBalanceLabel = new JLabel("Current Balance: $0.00");

        double[] balance = {0.0};

        setBalanceBtn.addActionListener(e -> {
            try {
                balance[0] = Double.parseDouble(balanceField.getText());
                currentBalanceLabel.setText("Current Balance: $" + String.format("%.2f", balance[0]));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid initial balance.");
            }
        });

        depositBtn.addActionListener(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                if (amount < 0) {
                    JOptionPane.showMessageDialog(frame, "Amount must be positive.");
                    return;
                }
                balance[0] += amount;
                currentBalanceLabel.setText("Current Balance: $" + String.format("%.2f", balance[0]));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid transaction amount.");
            }
        });

        // Event Handler: Withdraw
        withdrawBtn.addActionListener(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                if (amount < 0) {
                    JOptionPane.showMessageDialog(frame, "Amount must be positive.");
                    return;
                }
                if (amount > balance[0]) {
                    JOptionPane.showMessageDialog(frame, "Insufficient balance!");
                    return;
                }
                balance[0] -= amount;
                currentBalanceLabel.setText("Current Balance: $" + String.format("%.2f", balance[0]));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter a valid transaction amount.");
            }
        });

        // Add components to window
        frame.add(balanceInputLabel);
        frame.add(balanceField);
        frame.add(setBalanceBtn);
        frame.add(amountLabel);
        frame.add(amountField);
        frame.add(depositBtn);
        frame.add(withdrawBtn);
        frame.add(currentBalanceLabel);

        frame.setVisible(true);
    }
}