import java.util.Scanner;

public class Calculator {
    
    public static void add(int x,int y){
        System.out.println(x + y);
    }

    public static void multiply(int x,int y){
        System.out.println(x * y);
    }

    public static void subtract(int x,int y){
        System.out.println(x - y);
    }

    public static void divide(int x,int y){
        System.out.println(x / y);
    }


    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print(" What mathematical operation do you want to do ?");
        System.out.println("Press 1 to Add, 2 to Subtract, 3 to Multiply, 4 to Divide.");

        int o = scn.nextInt();

        System.out.println("Please enter your values x and y.");

        int x = scn.nextInt();
        int y = scn.nextInt();

        if ( o == 1) {
            Calculator.add(x, y);
        }else if (o == 2) {
            Calculator.subtract(x, y);
        }else if (o == 3) {
            Calculator.multiply(x, y);
        }else if (o == 4) {
            Calculator.divide(x, y);
        }
    
        scn.close();

    }



}
