

public class Task {


    private String task;
    private boolean progress = false;


    public Task() {
    }


    public void setTask(String task) {
        this.task = task;
    }


    public void setProgress(boolean progress) {
        this.progress = progress;
    }


    @Override
    public String toString() {

            if (progress){
                return  task + " [Completed] \n";
            }else {
                return  task + " [Pending] \n";
            }

    }


}
