import java.util.Scanner;

public class Controller {


    Scanner scanner = new Scanner(System.in);

    View view = new View();

    Service service = new Service();


    public void run(){


            while (true){


                view.front_View();
                int option = scanner.nextInt();

                switch (option) {

                    case 1:
                        scanner.nextLine();
                        System.out.print("\nSelected Option : " + option + "\n");
                        System.out.print("Enter Item name : ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Quantity : ");
                        int quantity = scanner.nextInt();
                        System.out.print("Enter Price Per Unit : ");
                        double price = scanner.nextInt();
                        service.add_item(name, quantity, price);
                        break;
                    case 2:
                        System.out.print("\nSelected Option : " + option + "\n");
                        service.view_Cart();
                        break;

                    case 3:
                        scanner.nextLine();
                        System.out.print("\nSelected Option : " + option + "\n");
                        System.out.print("Enter Item name : ");
                        String uname = scanner.nextLine();
                        System.out.print("Enter Quantity : ");
                        int uquantity = scanner.nextInt();
                        service.update_Item(uname, uquantity);
                        break;

                    case 4:
                        scanner.nextLine();
                        System.out.print("\nSelected Option : " + option + "\n");
                        System.out.print("Enter Item name : ");
                        String rname = scanner.nextLine();
                        service.remove_Item(rname);

                    case 5:
                        System.out.print("\nSelected Option : " + option + "\n");
                        service.checkOut();
                        break;


                    default:
                        break;

                }

                if (option > 5) break;

            }

            System.out.print("\n\n Exiting Shopping Cart. Have a great day!  \n\n");

    }







}

