import java.util.Scanner;

public class Database_checker {

    public static void main(String[] args) {

//        Make interface with Swing later; just commmand line for now

        System.out.println("Welcome to database checker\n-------------------------\nTo begin, please enter the following information\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your database username: \n");
        String username = scanner.nextLine();

        System.out.println("Please enter your database password: \n");
        String patientName = scanner.nextLine();


        int choice;
        do {
            System.out.println("Please choose from the following actions:\n");
            System.out.println("1 List databases on this computer \n2 Check number of entries in database \n3 Delete database \n4 Create new database \n5 Close system down");
            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*");

            choice = scanner.nextInt();
            switch(choice) {
                case 1:
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
