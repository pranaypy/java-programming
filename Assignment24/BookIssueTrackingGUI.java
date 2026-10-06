package Assignment24;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class BookIssueTrackingGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Book Issue Tracking System");
        frame.setSize(420, 320);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Book ID:");
        l1.setBounds(30, 30, 120, 25);
        frame.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(160, 30, 200, 25);
        frame.add(t1);

        JLabel l2 = new JLabel("Student Name:");
        l2.setBounds(30, 70, 120, 25);
        frame.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(160, 70, 200, 25);
        frame.add(t2);

        JLabel l3 = new JLabel("Issue Date (YYYY-MM-DD):");
        l3.setBounds(30, 110, 180, 25);
        frame.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(200, 110, 160, 25);
        frame.add(t3);

        JLabel l4 = new JLabel("Return Date (YYYY-MM-DD):");
        l4.setBounds(30, 150, 180, 25);
        frame.add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(200, 150, 160, 25);
        frame.add(t4);

        JButton btnIssue = new JButton("Issue Book");
        btnIssue.setBounds(140, 200, 130, 30);
        frame.add(btnIssue);

        btnIssue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/symbiosis", "root", "1234");

                    String sql = "INSERT INTO book_issue VALUES (?, ?, ?, ?)";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, Integer.parseInt(t1.getText()));
                    pst.setString(2, t2.getText());
                    pst.setString(3, t3.getText());
                    pst.setString(4, t4.getText());

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(frame, "Book Issue Record Saved Successfully!");

                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    con.close();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
                }
            }
        });

        frame.setVisible(true);
    }
}