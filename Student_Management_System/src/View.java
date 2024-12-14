import java.util.Scanner;

public class View {

    Service service = new Service();

    Scanner scn = new Scanner(System.in);

    public void run(){

        while (true){
            System.out.println(" <== Student Management System ==> ");
            System.out.println("Press 1 to Add Student.");
            System.out.println("Press 2 to View Student Data.");
            System.out.println("Press 3 to Search Student by Roll Number.");
            System.out.println("Press 4 to Delete Student Data.");
            System.out.println("Press 5 to Modify Student Data.");
            System.out.println("Press 6 to Exit.");
            System.out.println("<------------------------------------------> \n");
            System.out.print(" ==>");

            int press = scn.nextInt();

            if (press == 1){
                service.addStudentView();
            } else if (press == 2) {
                service.showStudentData();
            } else if (press == 3) {
                service.search_Student_byRoll();
            } else if (press == 4) {
                service.delete_Student_byRoll();
            } else if (press == 5) {
                service.modify_Student_byRoll();
            }else {
                break;
            }
        }

    }




}
