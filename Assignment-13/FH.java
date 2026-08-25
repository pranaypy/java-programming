//import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FH {
    public static void main(String[] args){
        try{
            // Writing into file
            FileWriter writer = new FileWriter("data.txt");
            writer.write("Welcome to Java File Handling\n");
            writer.write("This is an example of writing and reading a file");
            writer.close();

            // Reading from file
            FileReader reader = new FileReader("data.txt");
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
