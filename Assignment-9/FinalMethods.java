class FinalParent{
    final void display() {
        System.out.println("This is a final method in parent class.");
        System.out.println("It cannot be overridden by child class");
    }
}

class FinalChild extends FinalParent{
    // void display(){ // This statement will cause a compile-time error
    //     System.out.println("This is a display method in parent class.");
    // } 

    void display(String name){
        System.out.println("This is a display method in child class with name: " + name);
        System.out.println("This will not cause a compile-time error because the parameters are different.");
    }
}


public class FinalMethods{
    public static void main(String[] args){
        FinalChild c = new FinalChild();
        c.display();
        c.display("Pranay");
    }
} 

