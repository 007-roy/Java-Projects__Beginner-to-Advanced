import java.util.Scanner;

public class Controller {

    Scanner scanner = new Scanner(System.in);



    Candidate_Counter candidateCounter = new Candidate_Counter();

    public void run(){

        while (true){

            view();

            int i = scanner.nextInt();

            if (i == 1){
                vote_Menu();
            } else if (i == 2) {
                candidateCounter.candidate_Record();
            } else if (i == 3) {
                break;
            }else {
                System.out.println("Wrong Input, Please Try Again.");
            }


        }


    }

    private void vote_Menu(){


        System.out.print("<==== Vote ====>\n");
        System.out.print("Selected Option : 1 \n\n" );
        System.out.print("Enter Your Name : ");
        scanner.nextLine();
        String voter_name = scanner.nextLine();
        System.out.print("Vote for Candidate : (Options : A,B,C) : ");
        String candidate_name = scanner.next();

        switch (candidate_name) {
            case "A" -> candidateCounter.addA();
            case "B" -> candidateCounter.addB();
            case "C" -> candidateCounter.addC();
        }

        System.out.println("Thank You, " + voter_name + "! Your record for Candidate "+candidate_name + " has been recorded.\n");


    }

    private void view(){

        System.out.print("<======  Simple Voting System  ======>\n\n");
        System.out.print("Menu Options : \n");
        System.out.print("1: Vote\n");
        System.out.print("2: View Results\n");
        System.out.print("3: Exit\n");
        System.out.print("<--------------------------------------------->\n\n");

    }


}


