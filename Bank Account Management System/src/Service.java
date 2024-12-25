import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {


    Scanner scanner = new Scanner(System.in);

    List<Account> data = new ArrayList<>();


    public void open_new_Account(){


        System.out.print("\n\n <---------------> Create Account <--------------> \n\n");
        System.out.print("Selected Option : 1 \n");



        System.out.print("Enter Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter Password : ");
        String password = scanner.nextLine();

        System.out.print("Enter Initial Deposit : ");
        double amount = scanner.nextDouble();


        Account account = new Account(name,password,amount);

        data.add(account);

        System.out.print("\nDear " + name +", Your Account has been created.\n");


    }



    public boolean login_Account(String name,String password){

        boolean statement = false;

        for (Account account : data){

            if (name.equals(account.getName()) && password.equals(account.getPassword())) {
                statement = true;
                break;
            }

        }

        return statement;
    }


    public void deposit_Money(String name){


        System.out.print("\n\n<---------> Deposit Amount <--------->\n\n");
        System.out.print("---------------------------------------------\n");
        System.out.print("Selected Option : 2\n");
        System.out.print("Enter Amount : ");

        double amount = scanner.nextDouble();

        for (Account account : data){

            if (name.equals(account.getName())){
                account.depositAmount(amount);
            }

        }

    }


    public void withdraw_Money(String name){


        System.out.print("\n\n<---------> Withdraw Amount <--------->\n\n");
        System.out.print("---------------------------------------------\n");
        System.out.print("Selected Option : 3\n");
        System.out.print("Enter Amount : ");

        double amount = scanner.nextDouble();

        for (Account account : data){

            if (name.equals(account.getName())){
                account.withdrawAmount(amount);
            }

        }

    }

    public void check_Balance(String name){

        System.out.print("\n\n<---------> Check Balance <--------->\n\n");
        System.out.print("---------------------------------------------\n");
        System.out.print("Selected Option : 4\n");

        for (Account account : data){

            if (name.equals(account.getName())){
                System.out.print("\nYour Balance is : $" + account.getAmount() + "\n");
            }

        }

    }














}


