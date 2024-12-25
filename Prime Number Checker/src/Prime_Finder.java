

public class Prime_Finder {



    private int count = 0;

    public void find_Prime(int value){


        if (value == 1) System.out.println(" Yes " + value + " is a prime number.");

        if (value % 2 == 0) System.out.println("Sorry Dear, that's not a prime number.");


        int range = (value / 2) + 1;

        for (int i = 3; i < range;i = i+2){

            if (value % i == 0){
                count++;
            }

        }

        if (count == 0) {
            System.out.println(" Yes " + value + " is a prime number.");
        } else {
            System.out.println("Sorry Dear, "+ value +" is not a prime number.");
            count--;
        }


    }



}


