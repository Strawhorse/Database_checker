import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Database_checker {

    //        create frame, menubar and submenu

    static JMenuBar mb;
    static JMenu x;
    static JMenuItem m1, m2, m3, m4, m5;
    static JFrame f;



    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        f = new JFrame("Database checker");
        mb = new JMenuBar();
        x = new JMenu();

        m1 = new JMenuItem("List Databases");
        m2 = new JMenuItem("List Database Entries");
        m3 = new JMenuItem("Delete Database/s");
        m4 = new JMenuItem("Create New Database/s");
        m5 = new JMenuItem("Close Program");

        x.add(m1);
        x.add(m2);
        x.add(m3);
        x.add(m4);
        x.add(m5);

        f.add(mb, BorderLayout.NORTH);

        f.setJMenuBar(mb);

        f.setSize(850,850);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);




//        scanner for reading in menu items - will remove and replace with proper methods and loops
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {

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

                    Database_actions.databaseChecker(schema, username, password);

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
