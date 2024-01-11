import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Database_checker extends JFrame implements ActionListener {

//    create instances of necessary variables
    JMenuBar menuBar;
    JMenu menu;
    JMenu menu2;
    JMenuItem m1;
    JMenuItem m2;
    JMenuItem m3;
    JMenuItem m4;
    JMenuItem m5;


//    JOptionPane for taking in database information



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



        //sub-menu items
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        m5.addActionListener(this);


//      display the frame
        this.setVisible(true);

    }



    //    Implemented ActionListener so much create actionPerformed method for the menu items
//    Use separate classes and methods to carry out actions
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==m1) {
            System.out.println("Check Database list");

//            Will try practice code here to make into a method in Database_actions later
            JTextField schemaField = new JTextField(10);
            JTextField usernameField = new JTextField(10);
            JTextField passwordField = new JTextField(10);

            JPanel myPanel = new JPanel();
            myPanel.add(new JLabel("Schema:"));
            myPanel.add(schemaField);
            myPanel.add(Box.createHorizontalStrut(15)); // a spacer
            myPanel.add(new JLabel("Username:"));
            myPanel.add(usernameField);
            myPanel.add(Box.createHorizontalStrut(15)); // a spacer
            myPanel.add(new JLabel("Password:"));
            myPanel.add(passwordField);

            int result = JOptionPane.showConfirmDialog(null, myPanel,
                    "Please Enter Database Schema, Username, and Password", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                System.out.println("Schema: " + schemaField.getText());
                System.out.println("Username: " + usernameField.getText());
                System.out.println("Password: " + passwordField.getText());
            } else {
                System.out.println("Nothing entered...");
            }

            try {
                Database_actions.databaseChecker();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }

        }

        if(e.getSource()==m2) {
            System.out.println("Check Database entries");
        }

        if(e.getSource()==m3) {
            System.out.println("Delete database/s");
        }

        if(e.getSource()==m4) {
            System.out.println("Create Database/s");
        }

        if(e.getSource()==m5) {
            System.out.println("Close");
            System.exit(0);
        }
    }






//    main method for instantiating the JFrame class
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Database_checker frame = new Database_checker();
    }



}




//        begin to create listeners for menu items and submenus
//        menu.addMenuListener(new MenuListener() {
//            @Override
//            public void menuSelected(MenuEvent e) {
//                System.out.println("This is the main menu");
//            }
//
//            @Override
//            public void menuDeselected(MenuEvent e) {
//
//            }
//
//            @Override
//            public void menuCanceled(MenuEvent e) {
//
//            }
//        });
//        menu2.addMenuListener(new MenuListener() {
//            @Override
//            public void menuSelected(MenuEvent e) {
//
//            }
//
//            @Override
//            public void menuDeselected(MenuEvent e) {
//
//            }
//
//            @Override
//            public void menuCanceled(MenuEvent e) {
//
//            }
//        });