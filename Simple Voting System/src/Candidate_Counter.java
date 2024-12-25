

public class Candidate_Counter {



    private int A = 0;
    private int B = 0;
    private int C = 0;



    public void addA(){
        A++;
    }

    public void addB(){
        B++;
    }

    public void addC(){
        C++;
    }



    public void candidate_Record(){

        System.out.print("Voting Results So Far : \n\n");
        System.out.print("Candidate A : " + getA() + " votes\n");
        System.out.print("Candidate B : " + getB() + " votes\n");
        System.out.print("Candidate C : " + getC() + " votes\n\n\n");

    }


    private int getA() {
        return A;
    }

    private int getC() {
        return C;
    }

    private int getB() {
        return B;
    }


}
