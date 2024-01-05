import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;


public class Database_checker extends JFrame {

    JMenuBar menuBar;
    JMenu menu;
    JMenu menu2;
    JMenuItem m1;
    JMenuItem m2;
    JMenuItem m3;
    JMenuItem m4;
    JMenuItem m5;

    Database_checker() {

//        set out the JFrame first
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setTitle("Database checker");
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

//        Then the menu bar and the menu/s
        menuBar = new JMenuBar();
        menu = new JMenu("Databases");
        menu2 = new JMenu("Other");

//        Now add menus to menu bar
        menuBar.add(menu);
        menuBar.add(menu2);

//        add items to the menus
        m1 = new JMenuItem("List Databases");
        m2 = new JMenuItem("List Database Entries");
        m3 = new JMenuItem("Delete Database/s");
        m4 = new JMenuItem("Create New Database/s");
        m5 = new JMenuItem("Close Program");

        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.add(m4);

        menu2.add(m5);


//        finally, set the menu bar to the frame
        this.setJMenuBar(menuBar);


//      display the frame
        this.setVisible(true);


    }




//    main method for instantiating the JFrame class

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Database_checker frame = new Database_checker();


    }
}
