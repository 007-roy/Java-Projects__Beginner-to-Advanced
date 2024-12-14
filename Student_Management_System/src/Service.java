import java.util.Scanner;




public class Service extends Controller {

    Scanner scn = new Scanner(System.in);

    Controller controller = new Controller();


    int nextLine = 0;


    public void addStudentView(){

        System.out.println(" <-- Student Management Book -->");

        if (nextLine < 1){
            nextLine++;
        }else{
            scn.nextLine();
        }

        System.out.print(" Please Enter Student Name : ");
        String name = scn.nextLine();

        System.out.print(" Please Enter Student Roll No : ");
        int roll = scn.nextInt();

        System.out.print(" Please Enter Student Marks : ");
        int marks = scn.nextInt();

        controller.addStudent(roll,name,marks);

        if (controller.count == 1){
            System.out.println(" Data Inserted Successfully! \n" +
                    " Please keep patience, returning to homepage.");
            controller.count--;
        }else {
            System.out.println(" Data Insertions Failed. Please Try Again!!!");
        }

    }


    public void showStudentData(){

        System.out.println(" <-- Student Management Book -->");

        controller.showStudent();

    }


    public void search_Student_byRoll(){

        System.out.println(" <-- Student Management Book -->");

        System.out.print(" Please Enter Your Roll Number : ");

        int roll = scn.nextInt();

        controller.searchStudent(roll);

        System.out.println("Have a Nice Day!!!");

    }



    public void delete_Student_byRoll(){

        System.out.println(" <-- Student Management Book -->");

        System.out.print(" Please Enter Your Roll Number : ");

        int roll = scn.nextInt();

        controller.deleteStudent(roll);

        System.out.println("Have a Nice Day!!!");

    }

    public void modify_Student_byRoll(){

        System.out.println(" <-- Student Management Book -->");

        System.out.print(" Please Enter Your Roll Number : ");

        int roll = scn.nextInt();

        System.out.print("Please, Press 1 to modify name.");
        System.out.print("OR Press 2 to modify marks.");
        System.out.println("Press 3 to modify both.");

        int decision_number = scn.nextInt();

        

        if (decision_number == 1){
            scn.nextLine();
            System.out.print("Please Insert Your Name : ");
            String name = scn.nextLine();
            controller.updateStudent(roll,name);
            System.out.println("Your name has been updated successfully!!!");
        } else if (decision_number == 2) {
            System.out.print("Please Insert Your Marks : ");
            int marks = scn.nextInt();
            controller.updateStudent(roll,marks);
            System.out.println("Your marks has been updated successfully!!!");
        }else if(decision_number == 3){
            scn.nextLine();
            System.out.print("Please Insert Your Name : ");
            String name = scn.nextLine();
            System.out.print("Please Insert Your Marks : ");
            int marks = scn.nextInt();
            controller.updateStudent(roll,name,marks);
            System.out.println("Your name and marks has been updated successfully!!!");
        }else {
            System.out.println("Nothing has been changed.");
        }

        System.out.println("Have a Nice Day!!!");

    }





}
