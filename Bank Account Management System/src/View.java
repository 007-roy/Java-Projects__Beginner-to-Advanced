public class View {



    public void front_View(){

        System.out.print("\n\n<=======>  Bank Account Management System <=======>\n\n");
        System.out.print("1. Create New Account.\n");
        System.out.print("2. Log into Account.\n");
        System.out.print("3. Exit.\n");
        System.out.print("\n-----------------------------------------------------------\n\n");
        System.out.print("==>");

    }


    public void login_View(String name){

        System.out.print("\n\n<=======>  Bank Account Management System <=======>\n\n");
        System.out.print("Welcome Mr/Mrs " + name + " to your Account.\n");
        System.out.print("1. Check Balance.\n");
        System.out.print("2. Deposit Money.\n");
        System.out.print("3. Withdraw Money.\n");
        System.out.print("4. Log out to Main Menu.\n");
        System.out.print("\n-----------------------------------------------------------\n\n");
        System.out.print("==>");

    }

    public void pass_wrong_View(){

        System.out.print("\nUserName Or Password Error!!!\n" +
                "Please Try Again!!!\n" +
                "Don't have Account??? Press 1 to Create new Account...\n");

    }



}
