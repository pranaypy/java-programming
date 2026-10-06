package Assignment23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class DisplayRecordsOneByOne {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/symbiosis", "root", "1234");

        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        System.out.println("--- NAVIGATING RECORDS ONE BY ONE ---");
        
        while (rs.next()) {
            System.out.println("\nRoll No : " + rs.getInt("roll_no"));
            System.out.println("Name    : " + rs.getString("name"));
            System.out.println("Course  : " + rs.getString("course"));
            System.out.println("Marks   : " + rs.getDouble("marks"));
            
            System.out.print("\nPress ENTER to see the next record (or type 'exit' to stop)... ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
        }

        System.out.println("\nOver...");
        con.close();
        sc.close();
    }
}