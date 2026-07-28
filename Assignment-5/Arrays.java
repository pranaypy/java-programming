import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {5,2,8,3,1,6};

        // displaying elements of array
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]+" ");
        }

        System.out.println("\n");

        // enhanced for loop
        for(int i : numbers){
            System.out.print(i+" ");
        }

        scanner.close();
    }
    
}
