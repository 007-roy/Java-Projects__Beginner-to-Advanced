import java.util.Scanner;

public class Controller {

    Scanner scanner = new Scanner(System.in);

    View view = new View();

    Service service = new Service();


    public void run(){



        while (true){

            view.frontView();

            int option = scanner.nextInt();


            if (option == 1){

                service.create();


            } else if (option == 2) {

                service.view();

            } else if (option ==3) {

                scanner.nextLine();
                System.out.println("Enter Employee Name to Delete Data : ");
                String  name = scanner.nextLine();

                service.delete(name);

            } else if (option == 4) {


                scanner.nextLine();
                System.out.println("\nEnter Employee Name to Continue : ");
                String  name = scanner.nextLine();

                while (true){


                    view.updateView();
                    int operation= scanner.nextInt();

                    if (operation == 1) {


                        System.out.print("\nEnter new ID : ");
                        int id = scanner.nextInt();


                        scanner.nextLine();
                        System.out.print("\nEnter new Department Name : ");
                        String departName = scanner.nextLine();

                        System.out.print("\nEnter new Employee Salary : ");
                        double salary = scanner.nextDouble();


                        service.update(name,id,departName,salary);

                    } else if (operation == 2) {


                        System.out.print("\nEnter new ID : ");
                        int id = scanner.nextInt();


                        service.update(name,id);

                    } else if (operation == 3) {


                        System.out.print("\nEnter new Department Name : ");
                        String departName = scanner.nextLine();


                        service.update(name,departName);

                    } else if (operation == 4) {

                        System.out.print("\nEnter new Salary  : ");
                        double salary = scanner.nextDouble();

                        service.update(name,salary);

                    }else {

                        break;

                    }


                }

                System.out.print("\nGoing Back to Main Menu\n");

            }else {
                break;
            }


        }

        System.out.println("\nThank You!!! Please Come Again!!!\n");



    }





}


