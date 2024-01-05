import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;


public class Database_checker extends JFrame {

    JMenuBar menuBar;
    JMenu menu;
//    JMenu othermenus;

    Database_checker() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.setTitle("Database checker");
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();
        menu = new JMenu("File");

//        Now add menu to menu bar
        


        this.setJMenuBar(menuBar);


//      display the frame
        this.setVisible(true);




//        mb = new JMenuBar();
//        x = new JMenu();
//
//        m1 = new JMenuItem("List Databases");
//        m2 = new JMenuItem("List Database Entries");
//        m3 = new JMenuItem("Delete Database/s");
//        m4 = new JMenuItem("Create New Database/s");
//        m5 = new JMenuItem("Close Program");
//
//        x.add(m1);
//        x.add(m2);
//        x.add(m3);
//        x.add(m4);
//        x.add(m5);
//        mb.add(x);
//
//        f.add(mb, BorderLayout.NORTH);
//        f.setJMenuBar(mb);

    }



//    main method for instantiating the JFrame class

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Database_checker frame = new Database_checker();


    }
}
