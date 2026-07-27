import java.util.Scanner;

public class StudentMarksConversion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of student 1: ");
        String name1 = scanner.nextLine();

        System.out.print("Enter name of student 2: ");
        String name2 = scanner.nextLine();


        System.out.printf("\nEnter marks of %s: ", name1);
        String marks1 = scanner.nextLine();

        System.out.printf("Enter name of %s: ", name2);
        String marks2 = scanner.nextLine();

        // Converting Wrapper classes
        Integer num1 = Integer.valueOf(marks1);
        Integer num2 = Integer.valueOf(marks2);

        //Unboxing (Wrapper to data type)
        int m1 = num1;
        int m2 = num2;

        System.out.printf("\nMarks of %s: %d\n",name1, m1);
        System.out.printf("Marks of %s: %d",name2, m2);

        scanner.close();
    }
}
