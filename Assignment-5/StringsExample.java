import java.util.Scanner;

public class StringsExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        

        // literal way of defining string
        String str1 = "Hello";

        // String defined by creatiing class object
        String str2 = new String("I am Pranay");

        str1 = "Hi";
        str2 = "Python";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println("Length: "+ str2.length());
        System.out.println("Trimmed: "+ str2.trim());
        System.out.println("Length: "+ str2.toUpperCase());

        scanner.close();
    }
}
