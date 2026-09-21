import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;

public class StudentRegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel titleLabel = new JLabel("Student Registration");
        titlePanel.add(titleLabel);

        JPanel namePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel nameLabel = new JLabel("Name: ");
        JTextField nameField = new JTextField(15);
        namePanel.add(nameLabel);
        namePanel.add(nameField);

        JPanel emailPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel emailLabel = new JLabel("Email: ");
        JTextField emailField = new JTextField(15);
        emailPanel.add(emailLabel);
        emailPanel.add(emailField);

        JPanel departmentPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel departmentLabel = new JLabel("Department: ");
        JTextField departmentField = new JTextField(15);
        departmentPanel.add(departmentLabel);
        departmentPanel.add(departmentField);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton submitButton = new JButton("Register");
        buttonPanel.add(submitButton);

        mainPanel.add(titlePanel);
        mainPanel.add(namePanel);
        mainPanel.add(emailPanel);
        mainPanel.add(departmentPanel);
        mainPanel.add(buttonPanel);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}