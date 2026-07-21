class Employee{
    int emp_id;
    String name;
    int age;
    String dept;

    //Default Constructor
    Employee(){
        emp_id = 101;
        name = "John Doe";
        age = 30;
        dept = "Sales";
    }

    //Parameterized Constructor
    Employee(int e_id, String n, int a, String d){
        emp_id = e_id;
        name = n;
        age = a;
        dept = d;
    }

    //Copy Constructor
    Employee(Employee e){
        emp_id = e.emp_id;
        name = e.name;
        age = e.age;
        dept = e.dept;
    }

    void display(){
        System.out.println("Employee ID: " +emp_id);
        System.out.println("Employee Name: " +name);
        System.out.println("Employee Age: " +age);
        System.out.println("Employee Department: " +dept+"\n");
    }


}

public class Constructors {
    public static void main(String[] args){
        Employee emp1 = new Employee();
        System.out.println("Default Constructor");
        emp1.display();

        Employee emp2 = new Employee(102, "Joshua Johnson", 25, "Testing");
        System.out.println("Parameterized Constructor");
        emp2.display();

        Employee emp3 = new Employee(emp2);
        System.out.println("Copy Constructor");
        emp3.display();
    }
}
