import java.util.Scanner;

public class Controller {


    Scanner scn = new Scanner(System.in);

    Viewer viewer = new Viewer();

    Currency_Meter currency_meter = new Currency_Meter();


    public void control(){





        while(true){

            viewer.view();

            int decision = scn.nextInt();

            if (decision == 1){
                System.out.print("Enter Amount in USD : ");
                double usd = scn.nextDouble();
                currency_meter.usd_Eur(usd);
            } else if (decision == 2) {
                System.out.print("Enter Amount in EURO : ");
                double eur = scn.nextDouble();
                currency_meter.eur_Usd(eur);
            } else if (decision == 3) {
                System.out.print("Enter Amount in USD : ");
                double usd = scn.nextDouble();
                currency_meter.usd_gbp(usd);
            } else if (decision == 4) {
                System.out.print("Enter Amount in GBP : ");
                double gbp = scn.nextDouble();
                currency_meter.gbp_Usd(gbp);
            }else {
                break;
            }


        }

        System.out.println("\nThank You!!! Please Come Again....");

    }



}
