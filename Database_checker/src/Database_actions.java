import Connection.DB;
import java.sql.*;

public class Database_actions {

//    enter database methods here
    public static void databaseChecker() throws SQLException, ClassNotFoundException {
        boolean check = false;
        Connection con = DB.getCon();
        System.out.println("Database connection reached...");

//        this works, it prints - problem lies below (check mysql database checker)

    }

    public static void listDatabaseEntries(){
        System.out.println("Entries for database include:");
    }

}
