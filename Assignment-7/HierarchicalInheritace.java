class HierarchicalAnimal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class DogChild extends HierarchicalAnimal {  
    void bark() {
        System.out.println("Dog barks!");
    }
}

class CatChild extends HierarchicalAnimal {  
    void meow() {
        System.out.println("Cat meows!");
    }
}


public class HierarchicalInheritace {
    public static void main(String[] args){
        DogChild d = new DogChild();
        d.eat();  // Inherited from HierarchicalAnimal
        d.bark(); // Defined in DogChild
        
        CatChild c = new CatChild();
        c.eat();  // Inherited from HierarchicalAnimal
        c.meow(); // Defined in CatChild
    }
    
}
