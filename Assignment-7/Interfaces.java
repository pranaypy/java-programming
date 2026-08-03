// used to implement multiple inheritance in java
interface InterfaceAnimal{
    void sound();
}

class Dog1 implements InterfaceAnimal{ // has to write logic for each method of interface
    public void sound(){
        System.out.println("Dog barks!");
    }
}

public class Interfaces {
    public static void main(String[] args){
        Dog1 d = new Dog1();
        d.sound(); // method defined in Dog1 class
    }
    
}
