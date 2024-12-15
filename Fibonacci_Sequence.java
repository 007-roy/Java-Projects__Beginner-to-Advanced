import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci_Sequence {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while (true) {

            System.out.print(
                    "Please press your desired number to get the value of the Sequence.\n"
                    );

            System.out.print("==> ");

            int n = scn.nextInt();

            List<Integer> list;
            list = new ArrayList<>();

            int prev = 0;
            int next = 1;
            list.add(prev);
            list.add(next);

            for (int i = 0; i < n; i++) {

                int temp = prev;
                prev = next;
                next = temp + prev;
                list.add(next);

            }

            System.out.print(" The Sequence is : \n");

            for (int nums : list) {
                System.out.println(nums);
            }

            System.out.print(" Do you want to find new sequence again? ");
            System.out.print("Press 1 to Continue.");
            System.out.print("Press 2 to Exit.\n");
            System.out.print("==> ");

            int con = scn.nextInt();

            if (con == 2) {
                break;
            }
        }

    }

}