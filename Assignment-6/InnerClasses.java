// Demostrating Inner classes in Java

//Outer class
class Outer{
    private String message = "Hello from Outer Class";

    // Inner class
    class Inner {
        void display(){
            System.out.println("Message: "+message);
        }

    
    // Types of Inner classes
    // 1. Member Inner Class -> class defined inside a another class but not inside a method
    //                       -> It can access all members of the outer class including private members

    // 2. Local Inner Class -> class defined inside a method, constructor or block of the outer class

    // 3. Anonymous Inner Class -> class defined without a name and for which only a single object is created
    //                          -> One time implementation by extending a class or implementing an interface

    // 4. Static Nested Class -> class defined as static inside another class
    //                          -> It cannot directly access non-static members of the outer class



    }
}



public class InnerClasses {
    public static void main(String[] args){
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner();
        in.display();

    }
    
}
