import java.util.Scanner;
import java.util.Vector;

public class VectorsExample {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.println("Numbers"+numbers);
        numbers.remove(1);// removes element at index 1
        System.out.println("Numbers after element at index 1 is removed"+numbers);

        System.out.println("Size: "+numbers.size());// length of ArrayList
        System.out.println("Element at index 0: "+numbers.get(0));

        scanner.close();
    }
}
