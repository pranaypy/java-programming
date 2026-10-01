package Assignment22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class HospitalStaffLogin {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hospital Staff Login ID: ");
        String loginId = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/symbiosis", "root", "1234");

        String sql = "SELECT name, role FROM hospital_staff WHERE login_id = ? AND password = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, loginId);
        pst.setString(2, password);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            String name = rs.getString("name");
            String role = rs.getString("role");

            System.out.println("----------------------------------------");
            System.out.println("Authentication Successful!");
            System.out.println("Access Granted to [" + role + "]: " + name);
            System.out.println("----------------------------------------");
        } else {
            System.out.println("Authentication Failed: Invalid Login ID or Password.");
        }

        con.close();
        sc.close();
    }
}