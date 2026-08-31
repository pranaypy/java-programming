import faculty.FacultyInfo;
import student.StudentsInfo;

public class MainFile {
    public static void main(String[] args) {
        StudentsInfo s = new StudentsInfo(101, "Ajay");
        FacultyInfo f = new FacultyInfo(501, "Dr. Kumar");

        s.display();
        f.display();
    }
    
}
