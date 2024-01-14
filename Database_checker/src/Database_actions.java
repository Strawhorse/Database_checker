import Connection.DB;
import java.sql.*;

public class Database_actions {

//    enter database methods here
    public static void databaseChecker(String user, String password) throws SQLException, ClassNotFoundException {
        Connection con = DB.getCon(user, password);
        System.out.println("Database connection reached...");
//        String query = "SHOW DATABASES";
//        String query2 = "select * from profile;";
//        PreparedStatement p = con.prepareStatement(query);
//        p.executeUpdate();
//        Might be a problem with this statement

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SHOW DATABASES;");

        rs.close();
        stmt.close();
        con.close();

        System.out.println("Worked ...");


    }


}
