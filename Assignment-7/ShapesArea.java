import java.util.Scanner;

class Shapes{
    void function(){
        System.out.println("Calculating area");
    }

}

class Rectangle extends Shapes{
    void area(int length, int breadth){
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area+" sq units"+"\n");
    }
}

class Circle extends Shapes{
    void area(int radius){
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area+" sq units"+"\n");
    }
}

public class ShapesArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int length = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = scanner.nextInt();
        scanner.nextLine();

        Rectangle r = new Rectangle();
        r.function(); // method defined in Shapes class
        r.area(length, breadth); // method defined in Rectangle class

        System.out.print("Enter radius of circle: ");
        int radius = scanner.nextInt();
        scanner.close();

        Circle c = new Circle();
        c.function(); // method defined in Shapes class
        c.area(radius); // method defined in Circle class
    }
    
}
