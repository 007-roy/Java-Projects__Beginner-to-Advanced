import java.util.Scanner;

public class Controller {


    Scanner scn = new Scanner(System.in);

    FrontView frontView = new FrontView();

    Factorial_Machine factorialMachine = new Factorial_Machine();

    public void run(){

        while(true){

            frontView.front_View();

            int decision = scn.nextInt();


            if (decision == 1){
                System.out.print("Press Enter Your Number : ");
                int number = scn.nextInt();
                factorialMachine.factorial_machine(number);

            } else if (decision == 2) {
                System.out.print("<====    Factorial Finder Machine    ====>\n\n");
                System.out.print("This machine is specially created for children,\n" +
                        "to introduce them in the world of Mathematics.\n" +
                        "Be assured your kids will have fun.\n" +
                        "Thank You!!!Please Have Fun.\n\n");
            } else {
                break;
            }

        }

        System.out.println("Thank You Dear!!! Please Come Again.");

    }

}