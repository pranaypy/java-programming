package Assignment20;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Roll Number to delete: ");
        int rollNo = scanner.nextInt();

        String sql = "DELETE FROM student WHERE roll_no = ?";

        try (Connection con = DatabaseConnManipulation.getConnection();
             PreparedStatement pst = con.prepareStatement(sql)) {

            pst.setInt(1, rollNo);
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Student record with Roll No " + rollNo + " deleted successfully!");
            } else {
                System.out.println("No student found with Roll No " + rollNo + ".");
            }

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver class not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Database error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}