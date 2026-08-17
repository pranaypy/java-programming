interface IAnimal{
    void sound(); // abstract method
}

class IDog implements IAnimal{
    public void sound(){
        System.out.println("Dog Barks!");
    }
}

public class InterfacesExample {
    public static void main(String[] args){
        IAnimal a = new IDog();
        a.sound();
    }
}
