import java.sql.SQLException;
import java.util.Scanner;

public class Database_checker {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//        Make interface with Swing later; just commmand line for now

        System.out.println("Welcome to database checker\n");

        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Please choose from the following actions:\n");
            System.out.println("1 List databases on this computer \n2 Check number of entries in database \n3 Delete database \n4 Create new database \n5 Close system down");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");

            choice = scanner.nextInt();
            switch(choice) {
                case 1:

                    scanner.nextLine();
                    System.out.println("Please enter your database SQL URL name: \n");
                    String schema = scanner.nextLine();

                    System.out.println("Please enter your database username: \n");
                    String username = scanner.nextLine();

                    System.out.println("Please enter your database password: \n");
                    String password = scanner.nextLine();

                    Database_actions.databaseChecker(username, password);

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Thank you for using the database checker.");
                    break;
            }
        } while (choice !=5);
    }
}
