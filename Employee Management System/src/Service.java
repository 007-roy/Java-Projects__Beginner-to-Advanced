import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    Scanner scanner = new Scanner(System.in);

    List<Employee> list = new ArrayList<>();



    public void create(){


        System.out.print("\nPlease Enter Employee ID : ");
        int id = scanner.nextInt();

        scanner.nextLine();
        System.out.print("\nPlease Enter Employee Name : ");
        String name = scanner.nextLine();


        System.out.print("\nPlease Enter the Department Name : ");
        String departName = scanner.nextLine();

        System.out.print("\nPlease Enter the Employee Salary : ");
        double salary = scanner.nextDouble();

        Employee employee = new Employee(name,id,departName,salary);

        list.add(employee);

        System.out.println("\nEmployee : " + name + "'s details has been recorded successfully.....");


    }


    public void view(){
        int count = 1;
        System.out.println("Employee Name    ||    Employee ID     ||     Employee Department      ||       Salary \n");

        for (Employee employee : list){
            System.out.print(count + ". " + employee.toString() + " \n");
            count++;
        }

    }



    public void delete(String name){

        for (Employee employee : list){

            if (name.equals(employee.getName())){
                list.remove(employee);
                System.out.println("\nEmployee " + name + "'s record has been removed.\n");
                break;
            }

        }


    }



    public void update(String name,int id){


        for (Employee employee : list){

            if (name.equals(employee.getName())){
                employee.setId(id);
                System.out.println("\nEmployee " + name + "'s ID has been Updated.\n");
                break;
            }

        }


    }

    public void update(String name,String department){


        for (Employee employee : list){

            if (name.equals(employee.getName())){
                employee.setDepartment(department);
                System.out.println("\nEmployee " + name + "'s Department name has been Updated.\n");
                break;
            }

        }


    }


    public void update(String name,double salary){


        for (Employee employee : list){

            if (name.equals(employee.getName())){
                employee.setSalary(salary);
                System.out.println("\nEmployee " + name + "'s Salary has been Updated.\n");
                break;
            }

        }


    }

    public void update(String name,int id,String department,double salary){


        for (Employee employee : list){

            if (name.equals(employee.getName())){
                employee.setId(id);
                employee.setDepartment(department);
                employee.setSalary(salary);
                System.out.println("\nEmployee " + name + "'s Data has been modified completely.\n");
                break;
            }

        }


    }



}
