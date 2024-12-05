import java.util.Scanner;

public class Guessing_Game {

    public static void guess() {

        int k = (int) (Math.random() * 1000) ;

        

        System.out.println("Please enter a Number. \n" );

        int n = 0;

        while (n != k) {

            Scanner scn = new Scanner(System.in);

            n = scn.nextInt();

            if (n > k) {

                System.out.println("Try Smaller Number.");
                

            } else if (n < k) {

                System.out.println("Try Bigger Number.");
                

            } else {

                System.out.println(" Congratulations!!! You have won. ");
                break;

            }

        }

    }

    public static void main(String[] args) {

        Guessing_Game.guess();

    }

}
