package Assignment24;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LibraryManagementGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Library Management System");
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Book ID:");
        l1.setBounds(30, 30, 100, 25);
        frame.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(140, 30, 200, 25);
        frame.add(t1);

        JLabel l2 = new JLabel("Title:");
        l2.setBounds(30, 70, 100, 25);
        frame.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(140, 70, 200, 25);
        frame.add(t2);

        JLabel l3 = new JLabel("Author:");
        l3.setBounds(30, 110, 100, 25);
        frame.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(140, 110, 200, 25);
        frame.add(t3);

        JLabel l4 = new JLabel("Price:");
        l4.setBounds(30, 150, 100, 25);
        frame.add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(140, 150, 200, 25);
        frame.add(t4);

        JButton btnAdd = new JButton("Add Book");
        btnAdd.setBounds(140, 200, 120, 30);
        frame.add(btnAdd);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/symbiosis", "root", "1234");

                    String sql = "INSERT INTO library VALUES (?, ?, ?, ?)";
                    PreparedStatement pst = con.prepareStatement(sql);
                    pst.setInt(1, Integer.parseInt(t1.getText()));
                    pst.setString(2, t2.getText());
                    pst.setString(3, t3.getText());
                    pst.setDouble(4, Double.parseDouble(t4.getText()));

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(frame, "Book Added Successfully!");

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