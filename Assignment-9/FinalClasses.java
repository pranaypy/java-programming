final class FinalParentClass {
    void display() {
        System.out.println("This is a final class. It cannot be extended.");
    }
}

// class FinalChildClass extends FinalParentClass { 
// }
// This statement will cause a compile-time error

public class FinalClasses {
    public static void main(String[] args){
        FinalParentClass obj = new FinalParentClass();
        obj.display();
    }
    
}
