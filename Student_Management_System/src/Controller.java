import java.util.ArrayList;
import java.util.List;



public class Controller extends Model {

    int count = 0;


    List<Model> models = new ArrayList<>();


    public void addStudent(int roll,String name, int marks){
        Model modelObj = new Model(roll,name,marks);

        models.add(modelObj);
        count++;
    }


    public void showStudent(){

        for (Model stu : models){
            System.out.println(" Name : " + stu.getName() + " || Roll : " + stu.getRoll() + " || Marks : " + stu.getMarks());
        }

    }

    public void searchStudent(int roll){

        for (Model stu : models){

            if (stu.getRoll() == roll){
                System.out.println(" Name : " + stu.getName() + " || Roll : " + stu.getRoll() + " || Marks : " + stu.getMarks());
            }
        }

    }

    public void deleteStudent(int roll){

        for (int i = 0; i < models.size(); i++){
            if (models.get(i).getRoll() == roll){
                //noinspection SuspiciousListRemoveInLoop
                models.remove(i);
            }
        }

    }

    public void updateStudent(int roll,String name){

        for (Model model : models) {
            if (model.getRoll() == roll) {
                model.setName(name);
            }
        }

    }

    public void updateStudent(int roll,int marks){

        for (Model model : models) {
            if (model.getRoll() == roll) {
                model.setMarks(marks);
            }
        }

    }

    public void updateStudent(int roll,String name,int marks){

        for (Model model : models) {
            if (model.getRoll() == roll) {
                model.setName(name);
                model.setMarks(marks);
            }
        }

    }


}
