class Employee{
    int empID;
    String empName;
    String empDept;

    Employee(int eID, String eName, String eDept){
        empID = eID;
        empName = eName;
        empDept = eDept;
    }

    void display(){
        System.out.println("Employee Details:");
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Department: " + empDept);
    }
}

class Manager extends Employee{
    int empID;
    String empName;
    String empDept;
    String position;
    int salary;

    Manager(int eID, String eName, String eDept, String pos, int sal) {
        super(eID, eName, eDept); 
        position = pos;
        salary = sal;
    }
    

    void display(){
        super.display(); // calls parent class display method
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeManagement{
    public static void main(String[] args){
        Manager m1 = new Manager(12823, "Akash Singh", "Development", "Project Manager", 2275000);
        m1.display();

    }
}