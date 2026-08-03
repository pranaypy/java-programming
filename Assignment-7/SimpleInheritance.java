class SimpleAnimal {
    void food() {
        System.out.println("This animal eats food.");
    }
}

class SimpleDog extends SimpleAnimal {  
    void bark() {
        System.out.println("Dog barks!");
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        SimpleDog d = new SimpleDog();
        d.food();  // Inherited from SimpleAnimal
        d.bark(); // Defined in SimpleDog   
    }
}