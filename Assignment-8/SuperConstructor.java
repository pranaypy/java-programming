class SuperParent2{
    SuperParent2(){
        System.out.println("Parent class constructor called");
    }
}

class SuperChild2 extends SuperParent2{
    SuperChild2(){
        super(); // calls parent class constructor
        System.out.println("Child class constructor called");
    }
}


public class SuperConstructor {
    public static void main(String[] args){
        new SuperChild2(); // valid statement
    }
    
}
