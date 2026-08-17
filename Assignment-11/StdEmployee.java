interface Printable{
    void displayinfo();
}

class StudentInfo implements Printable{
    String name;
    int prn;
    String branch;
    String div;

    StudentInfo(String n, int p, String br, String d){
        name = n;
        prn = p;
        branch = br;
        div = d;
    }

    public void displayinfo(){
        System.out.println("------- STUDENT INFO -------");
        System.out.println("Name: "+name);
        System.out.println("PRN: "+prn);
        System.out.println("Branch: "+branch);
        System.out.println("Division: "+div);
    }
}

class EmployeeInfo implements Printable{
    String name;
    int eID;
    String dept;
    String position;

    EmployeeInfo(String n, int e, String d, String p){
        name = n;
        eID = e;
        dept = d;
        position = p;
    }

    public void displayinfo(){
        System.out.println("\n------- EMPLOYEE INFO -------");
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+eID);
        System.out.println("Department: "+dept);
        System.out.println("Position: "+position);
    }
}


public class StdEmployee {
    public static void main(String[] args) {
        StudentInfo s1 = new StudentInfo("Pranay",139,"CSE","B");

        EmployeeInfo e1 = new EmployeeInfo("Akshay",1011,"Sales","Manager");

        s1.displayinfo();
        e1.displayinfo();
    }
    
}
