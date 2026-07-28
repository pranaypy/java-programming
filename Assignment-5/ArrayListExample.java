//ArrayList -> resizable dynamic array in Java
// consists of built in methods (add, remove, contains, etc.)
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        // adding elements to ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        System.out.print("Enter fruit name: ");
        String new_fruit = scanner.nextLine();
        fruits.add(new_fruit);

        System.out.print("Enter number: ");
        int new_num = scanner.nextInt();
        scanner.nextLine();
        numbers.add(new_num);

        //Removing elements from ArrayList
        System.out.println("Fruits: "+fruits);
        fruits.remove(new_fruit);
        fruits.remove("Banana");
        fruits.remove("Cherry");

        System.out.println("Fruits after removing 3 elements: "+fruits);
        fruits.remove("Apple");
        System.out.println("Fruits after removing  4 elements: "+fruits);

        System.out.println("Numbers: "+numbers);
        numbers.remove(2);
        numbers.remove(1);

        System.out.println("Numbers after removing 2 elements: "+numbers);
        numbers.remove(0);
        System.out.println("Numbers after removing 3 elements: "+numbers);


    
        System.out.println("Size: "+fruits.size());// length of ArrayList
        System.out.println("Contains Apple?: "+fruits.contains("Apple"));// check if elemnt is in ArrayList

        System.out.println("Size: "+numbers.size());// length of ArrayList
        System.out.println("Element at first index: "+numbers.contains(100));



        scanner.close();





    }
}
