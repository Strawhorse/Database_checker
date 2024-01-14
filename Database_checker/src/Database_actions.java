import Connection.DB;
import java.sql.*;

public class Database_actions {

//    enter database methods here
    public static void databaseChecker(String user, String password) throws SQLException, ClassNotFoundException {
        Connection con = DB.getCon(user, password);
        System.out.println("Database connection reached...");
        System.out.println("List of databases are: \n");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SHOW DATABASES");
        while(rs.next()){
            System.out.println(rs.getString(1));
            System.out.println();
        }





//Works now, was problem with JAR file

    }

    public static void listDatabaseEntries(String user, String password) throws SQLException {

//        https://stackoverflow.com/questions/21898053/display-records-from-mysql-database-using-jtable-in-java
//        https://coderanch.com/t/669395/java/Insert-data-JTable-existing-MySQL


        
        System.out.println("Entries for database include:");

        Connection con = DB.getCon(user, password);

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM PROFILE;");

        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String domain = rs.getString("domain");
            String address = rs.getString("address");
            System.out.format("%s, %s, %s, %s, id", id, name, domain, address);
        }
        rs.close();
        stmt.close();
        con.close();
    }


}
