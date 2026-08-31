package faculty;

public class FacultyInfo {
    private int fid;
    private String name;

    public FacultyInfo(int id, String n) {
        fid = id;
        name = n;
    }

    public void display() {
        System.out.println("Faculty ID: " + fid + ", Name: " + name);
    }
}
