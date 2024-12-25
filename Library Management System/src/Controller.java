import java.util.Scanner;

public class Controller {

    Scanner scanner = new Scanner(System.in);

    Service service = new Service();

    View view = new View();

    public void run(){

        while (true){

            view.welcome_page();

            int option = scanner.nextInt();

            if (option == 1){

                scanner.nextLine();

                System.out.print("Enter Book Title : ");

                String title = scanner.nextLine();

                System.out.print("Enter Author : ");

                String author = scanner.nextLine();

                System.out.print("Enter ISBN : ");

                int isbn = scanner.nextInt();

                service.add_Book(title,author,isbn);


            } else if (option == 2) {

                scanner.nextLine();

                System.out.print("Enter Book Title To Issue : ");

                String title = scanner.nextLine();

                System.out.print("Enter Borrower Name : ");

                String name = scanner.nextLine();

                service.issue_Book(title);

                System.out.print("Book '"+ title +"' has been issued to " + name + ".");

            } else if (option == 3) {

                scanner.nextLine();

                System.out.print("Enter Book Title To Return : ");

                String title = scanner.nextLine();

                service.return_Book(title);

                System.out.print("Book '"+ title +"' has been successfully returned. ");

            } else if (option == 4) {

                scanner.nextLine();

                System.out.print("Enter Book Title To Search : ");

                String title = scanner.nextLine();

                service.search_Book(title);

            }else if (option == 5) {

                System.out.print("All Books in Library:  \n");

                System.out.print("..................................\n\n");

                service.view_all_Book();

            }else {
                break;
            }

        }

        System.out.print("  Exiting Library Management System. Thank You!  \n");
        System.out.print("<---------------------------------------------------->");


    }


}
