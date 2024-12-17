public class Factorial_Machine {


    public void factorial_machine(int number){

        int data = 1;
        int size = number + 1;

        for (int i = 1; i < size; i++){
            data = data * i;
        }

        System.out.println("The factorial of " + number + " is : " + data + " \n");




    }


}
