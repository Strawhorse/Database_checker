import Connection.DB;
import java.sql.*;

public class Database_actions {

//    enter database methods here
    public static void databaseChecker(String username, String password) throws SQLException, ClassNotFoundException {
        boolean check = false;
        Connection con = DB.getCon(username, password);
        String query = "SHOW Databases;";
        assert con != null;
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while(rs.next()) {
            System.out.print(rs.getString(1));
            System.out.println();
        }
    }

}
