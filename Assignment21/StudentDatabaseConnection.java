package Assignment21;

import java.sql.Connection;
import java.sql.DriverManager;

public class StudentDatabaseConnection {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/symbiosis", "root", "1234");

        if (con != null && !con.isClosed()) {
            System.out.println("Student database is connected successfully.");
        }

        con.close();
    }
}