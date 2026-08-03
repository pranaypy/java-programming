class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}

public class AnonymousClasses {
    public static void main(String[] args){
        // Basic Instance of Animal class
        Animal basic = new Animal();

        // Anonymous class extending Animal class
        Animal a = new Animal(){
            void sound(){ // Polymorphism: Overriding the sound method (only valid for this instance only)
                System.out.println("Dog barks");
            }
        };

        // Anonymous class extending Animal class
        Animal  b = new Animal(){
            void sound(){ // Polymorphism: Overriding the sound method (only valid for this instance only)
                super.sound(); // Calling message from Animal class
                System.out.println("Dog barks");
            }
        };
        basic.sound(); // Will display details mentioned in Animal class
        a.sound(); // Will display the content which is overridden in the anonymous class
        b.sound(); // Will display the content which is overridden in the anonymous class
    }
}
