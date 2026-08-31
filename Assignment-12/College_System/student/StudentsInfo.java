package student;

public class StudentsInfo {
    private int sid;
    private String name;

    public StudentsInfo(int id, String n) {
        sid = id;
        name = n;
    }

    public void display() {
        System.out.println("Student ID: " + sid + ", Name: " + name);
    }
    
}
