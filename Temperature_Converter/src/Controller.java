import java.util.Scanner;

public class Controller extends Temperature_Method{

    Scanner scn = new Scanner(System.in);
    Controllable con = new Temperature_Method();
    Viewer viewer = new Viewer();

    public void control(){


        while(true){

            viewer.view();
            int opinion = scn.nextInt();
            if (opinion == 1){
                viewer.screen();
                double number = scn.nextDouble();
                con.celsius_Fahrenheit(number);
            } else if (opinion == 2) {
                viewer.screen();
                double number = scn.nextDouble();
                con.celsius_Kelvin(number);
            } else if (opinion == 3) {
                viewer.screen();
                double number = scn.nextDouble();
                con.fahrenheit_Celsius(number);
            } else if (opinion == 4) {
                viewer.screen();
                double number = scn.nextDouble();
                con.fahrenheit_Kelvin(number);
            } else if (opinion == 5) {
                viewer.screen();
                double number = scn.nextDouble();
                con.kelvin_Celsius(number);
            } else if (opinion == 6) {
                viewer.screen();
                double number = scn.nextDouble();
                con.kelvin_Fahrenheit(number);
            }else if (opinion == 7){
                break;
            }


        }

        System.out.println("Thank You for Your Patience");
        System.out.println("Exiting the Temperature Converter. Thank You!");

    }




}
