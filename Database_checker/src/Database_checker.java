import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.Scanner;

public class Database_checker extends JFrame {

    static JMenuBar mb;
    static JMenu x;
    static JMenuItem m1, m2, m3, m4, m5;
    static JFrame f;


    Database_checker() {
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
        mb.add(x);

        f.add(mb, BorderLayout.NORTH);
        f.setJMenuBar(mb);
        f.setSize(850,850);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }



//    main method for instantiating the JFrame class

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Database_checker frame = new Database_checker();


    }
}
