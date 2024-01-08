package Connection;
import java.sql.*;

public class DB {

    // create connection with database

    public static Connection getCon(String schema, String username, String password) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

//            for connection, user and password required for your own database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/"+schema, username, password);
            System.out.println("Connection successful");
            return con;

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return null;
    }

}
