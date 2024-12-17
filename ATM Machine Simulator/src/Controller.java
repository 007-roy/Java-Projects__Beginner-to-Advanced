import java.util.Scanner;

public class Controller {


    Scanner scn = new Scanner(System.in);

    View view = new View();

    ATM_Machine atm_machine = new Operations();

    public void run(){


        while (true){

            view.front_View();

            int decision = scn.nextInt();

            if (decision == 1){
                atm_machine.check_Balance();
            } else if (decision == 2) {
                System.out.print("Insert Your Withdrawal Amount : ");
                double amount = scn.nextDouble();
                atm_machine.withdraw_Money(amount);
            }else if (decision == 3) {
                System.out.print("Insert Your Deposit Amount : ");
                double amount = scn.nextDouble();
                atm_machine.deposit_Money(amount);
            }else {
                break;
            }


        }



    }











}
