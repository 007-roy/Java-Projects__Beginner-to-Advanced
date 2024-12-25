import java.util.Scanner;




public class Controler_View {

    Scanner scanner = new Scanner(System.in);

    Palindrome_Method palindromeMethod = new Palindrome_Method();

    public void view(){

        System.out.print("\n\n<=========> Palindrome checker  <=========>\n\n");
        System.out.print("Press 1 to enquire if the String is palindrome or not\n");
        System.out.print("Press 2 to Exit.\n");
        System.out.println("--------------------------------------------------------\n");
        System.out.print("==>");

    }


    public void run(){

        while (true){

            view();
            int option = scanner.nextInt();

            if (option == 1){

                scanner.nextLine();
                System.out.print("Selected Option : 1 \n");
                System.out.print("Please Enter String to Continue : ");
                String string = scanner.nextLine();
                palindromeMethod.main_method(string);

            }else {
                break;
            }

        }

        System.out.println("\nThank You.Please Come Again!!!\n");

    }



}
