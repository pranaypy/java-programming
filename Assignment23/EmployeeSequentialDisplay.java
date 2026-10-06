package Assignment23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeSequentialDisplay {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/symbiosis", "root", "1234");

        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("SELECT emp_id, name, department, salary FROM employee");

        int recordCount = 1;
        while (rs.next()) {
            System.out.println("----------------------------------------");
            System.out.println("RECORD #" + recordCount);
            System.out.println("Employee ID : " + rs.getInt("emp_id"));
            System.out.println("Name        : " + rs.getString("name"));
            System.out.println("Department  : " + rs.getString("department"));
            System.out.println("Salary      : " + rs.getDouble("salary"));
            System.out.println("----------------------------------------");

            recordCount++;
            System.out.print("Press ENTER to view next employee record... ");
            sc.nextLine();
        }

        System.out.println("End of employee database.");
        con.close();
        sc.close();
    }
}