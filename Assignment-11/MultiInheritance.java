interface P1{
    void display();
}

interface P2{
    void show();
}

class A implements P1,P2{
    public void display(){ // method in parent interface is public by default, it has to be public here to while defining
        System.out.println("Method from P1");
    }

    public void show(){ // method in parent interface is public by default, it has to be public here to while defining
        System.out.println("Method from P2");
    }
}


public class MultiInheritance {
    public static void main(String[] args){
        A a = new A();
        a.display();
        a.show();
    }
}
