import java.util.Scanner;



public class Controller {

    View view = new View();

    Scanner scanner = new Scanner(System.in);

    Service service = new Service();

    public void run(){

        while (true){

            view.frontView();
            int option = scanner.nextInt();

            if (option == 1){
                service.addTask();
            } else if (option == 2) {
                service.viewTask();
            } else if (option == 3) {
                service.mark();
            } else if (option == 4) {
                service.deleteTask();
            }else {
                break;
            }

        }

        System.out.print("\n\nThank You! Please Come Again!!\n\n");

    }


}
