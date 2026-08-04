class SuperParent{
    void display(){
        System.out.println("Parent class method called");
    }
}

class SuperChild extends SuperParent{
    void display(){
        super.display(); // calls parent class display method
        System.out.println("Child class method called");
    }
}

public class Super{
    public static void main(String[] args){
        SuperChild c1 = new SuperChild();
        c1.display();
    }
}