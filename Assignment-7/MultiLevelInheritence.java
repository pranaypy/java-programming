class Grandparent{
    void showGrandparent(){
        System.out.println("Grandparent class method");
    }
}

class Parent extends Grandparent{
    void showParent(){
        System.out.println("Parent class method");
    }
}

class Child extends Parent{
    void showChild(){
        System.out.println("Child class method");
    }
}

public class MultiLevelInheritence {
    public static void main(String[] args){
        Child c = new Child();
        c.showGrandparent(); // method called via multi-level inheritance from Grandparent
        c.showParent(); // method called via multi-level inheritance from Parent
        c.showChild(); // method defined in Child class
    }
    
}
