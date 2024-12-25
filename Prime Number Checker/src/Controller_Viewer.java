import java.util.Scanner;




public class Controller_Viewer {


    private Prime_Finder prime_finder = new Prime_Finder();

    private Scanner scanner = new Scanner(System.in);


    public void view(){

        System.out.print("\n\n<=========> Prime Number checker  <=========>\n\n");
        System.out.print("Press 1 to enquire if the Number is Prime or not\n");
        System.out.print("Press 2 to Exit.\n");
        System.out.println("--------------------------------------------------------\n");
        System.out.print("==>");

    }


    public void run(){

        while (true){

            view();
            int option = scanner.nextInt();

            if (option == 1){


                System.out.print("Selected Option : 1 \n");
                System.out.print("Please Enter String to Continue : ");
                int number = scanner.nextInt();
                prime_finder.find_Prime(number);

            }else {
                break;
            }

        }

        System.out.println("\nThank You.Please Come Again!!!\n");

    }

}
