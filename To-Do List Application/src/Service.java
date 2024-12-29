import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    Scanner scanner = new Scanner(System.in);

    List<Task> tasks = new ArrayList<>();

    private int count;

    public void addTask(){

        Task task = new Task();

        System.out.print("\nEnter Task : ");

        String work = scanner.nextLine();

        task.setTask(work);

        tasks.add(count,task);
        count++;

        System.out.print("\nTask added successfully!\n");

    }


    public void viewTask(){

        System.out.print("\n\nTasks : \n");
        System.out.print("---------------\n\n");


        int counter = 1;
        for (Task task:tasks){

            System.out.print(counter + ". "+task.toString());
            counter++;

        }

    }



    public void mark(){

        System.out.print("\nEnter task number to mark as completed : ");
        int serial = scanner.nextInt();
        serial--;

        tasks.get(serial).setProgress(true);
        System.out.print("Task marked as completed!\n");


    }



    public void deleteTask(){

        System.out.print("\nEnter task number to delete task completely : ");
        int serial = scanner.nextInt();

        serial--;

        tasks.remove(serial);

    }






}



