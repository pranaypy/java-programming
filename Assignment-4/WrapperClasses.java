import java.util.Scanner;

public class WrapperClasses{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Input Strings from user
        System.out.print("Enter first number: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second number: ");
        String str2 = scanner.nextLine();

        // String to Wrapper Object
        Integer num1 = Integer.valueOf(str1);
        Integer num2 = Integer.valueOf(str2);

        // Wrapper Object to Primitive (Unboxing)
        int a = num1;
        int b = num2;

        System.out.println(a);
        System.out.println(b);

        // Basic Operations
        System.out.println("\nArithmetic Operations");
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(a-b));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(a/b));

        
        // Primitive to Wrapper (Autoboxing)
        int x = 100;
        Integer wrapperX = x;

        System.out.println("\nPrimitive to Wrapper:");
        System.out.println("Primitive value: "+x);
        System.out.println("Wrapper value: "+wrapperX);

        // Wrapper to Primitive
        Integer wrapperY = Integer.valueOf(250);
        int y = wrapperY;
        System.out.println("Wrapper to Primitive: "+y);


        scanner.close();
    }
}