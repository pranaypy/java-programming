package Assignment22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginApp {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/symbiosis", "root", "1234");

        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            System.out.println("Login Successful! Welcome, " + username + ".");
        } else {
            System.out.println("Login Failed! Invalid Username or Password.");
        }

        con.close();
        sc.close();
    }
}