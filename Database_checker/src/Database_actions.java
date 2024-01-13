import Connection.DB;
import java.sql.*;

public class Database_actions {

//    enter database methods here
    public static void databaseChecker() throws SQLException, ClassNotFoundException {
        Connection con = DB.getCon();
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

    public static void listDatabaseEntries() throws SQLException {

//        https://stackoverflow.com/questions/21898053/display-records-from-mysql-database-using-jtable-in-java
//        https://coderanch.com/t/669395/java/Insert-data-JTable-existing-MySQL


        
        System.out.println("Entries for database include:");

        Connection con = DB.getCon();

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



    public boolean updateEntry(String newName, String newDomain, String newAddress, int id) {
//        make use of MySQL update command for final crud operation

        boolean check = false;
        try{
            Connection con = DB.getCon();
            String query = new StringBuilder().append("UPDATE profile set name=\'").append(newName).append("\', domain=\'").append(newDomain).append("\', address=\'").append(newAddress).append("\' where id=").append(id).toString();

//            Run command to delete entry
            PreparedStatement p = con.prepareStatement(query);
            p.execute();
            System.out.println("Successfully updated");

            System.out.println("Updated profile:\n");

            String checkQuery = "Select * from profile where id= "+id;
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(checkQuery);

            while(rs.next()) {
                System.out.println("\nID: " + rs.getInt(1) + "\nName: " + rs.getString(2) + "\nDomain: " + rs.getString(3) + "\nAddress: " + rs.getString(4));
            }
            check = true;
        }
        catch (Exception e){
            System.out.println(e);
        }

        return check;
    }

}
