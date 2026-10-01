package Assignment20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnManipulation {
        static String url = "jdbc:mysql://localhost:3306/symbiosis";
        static String user = "root";
        static String password = "1234";

        public static Connection getConnection() throws ClassNotFoundException, SQLException{
            Connection con = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            return con;
        }
}
