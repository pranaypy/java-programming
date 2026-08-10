abstract class AbstractShape{
    abstract void draw(); //abstract method

    void message(){
        System.out.println("This is a a shape");
    }
}

class AbstractCircle extends AbstractShape{
    void draw(){
        System.out.println("Drawing a Circle");
    }
}

public class AbstractClasses {
    public static void main(String[] args){
        AbstractShape c = new AbstractCircle();
        c.draw();
        c.message();
    }
}
