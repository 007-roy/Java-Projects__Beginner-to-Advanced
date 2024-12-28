


public class Employee {


    private final String name;

    private int id;

    private String department;

    private  double salary;



    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public void setId(int id) {
        this.id = id;
    }



    public void setDepartment(String department) {
        this.department = department;
    }



    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public String toString() {
        return "Employee Name : " + name + " ||  ID : " + id +
                " || Department : " + department + " || Salary : " + salary;
    }



}


