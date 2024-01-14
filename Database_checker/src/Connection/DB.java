package Connection;
import java.sql.*;

public class DB {

    // create connection with database

    public static Connection getCon(String user, String password) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

//            for connection, user and password required for your own database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost", user, password);
            System.out.println("Connection successful");
            return con;

        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        return null;
    }

}
