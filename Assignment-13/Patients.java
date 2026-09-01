import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Patients {
    public static void main(String[] args){
        try{
            FileWriter writer = new FileWriter("patientinfo.txt");
            writer.write("------- PATIENT INFORMATION -------\n");
            writer.write("Name: John Doe\n");
            writer.write("Patient ID: 10267\n");
            writer.write("Age: 36\n");  
            writer.write("Diagnosis: Healthy\n");
            writer.close();

            FileReader reader = new FileReader("patientinfo.txt");
            int ch;
            StringBuffer sb = new StringBuffer();

            while((ch=reader.read()) != -1){
                sb.append((char)(ch));
            }

            System.out.println(sb);
            reader.close();
        }catch (IOException e){
            System.out.println("Exception: "+e.getMessage());
            System.out.println("Error: "+e.getClass().getSimpleName()+" occurred.");
        }
    }
}
