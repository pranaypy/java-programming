import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeDetails{
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("employee.txt");
            writer.write("------- EMPLOYEE DETAILS -------\n");
            writer.write("Name: Ajay Kumar\n");
            writer.write("Age: 25\n");
            writer.write("Department: Development\n");
            writer.close();

            FileReader reader = new FileReader("employee.txt");
            int ch;
            StringBuffer sb = new StringBuffer();
            
            while((ch=reader.read()) != -1){
                sb.append((char)(ch));
            }

            System.out.println(sb);
            reader.close();
        } catch (IOException e){
            System.out.println("Exception: "+e.getMessage());
            System.out.println("Error: "+e.getClass().getSimpleName()+" occurred.");
        }
    }
}