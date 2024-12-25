import java.util.Scanner;




public class Controller {

    Scanner scanner = new Scanner(System.in);

    Service service = new Service();

    View view = new View();





    public void run(){


        while (true){

            view.front_View();

            int option = scanner.nextInt();

            if (option == 2){

                scanner.nextLine();
                System.out.print("\n\n Selected Option : 2\n\n");
                System.out.print("Enter Name : ");
                String name = scanner.nextLine();
                System.out.print("Enter Password : ");
                String password = scanner.nextLine();

                if (service.login_Account(name,password)) {

                    while (true){

                        view.login_View(name);
                        int options = scanner.nextInt();

                        if (options == 1){
                            service.check_Balance(name);
                        } else if (options == 2) {
                            service.deposit_Money(name);
                        } else if (options == 3) {
                            service.withdraw_Money(name);
                        }else {
                            break;
                        }

                    }

                }else {
                    view.pass_wrong_View();
                }
            } else if (option == 1) {
                service.open_new_Account();
            }else {
                break;
            }


        }

        System.out.println("\n\nExiting Bank Account Management System. Thank You!!!\n\n");

    }




}
