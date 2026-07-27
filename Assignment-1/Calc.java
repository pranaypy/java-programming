class MyCalc{
    int x = 10;
    int y = 20;

    void add(){
        int sum = x + y;
        System.out.println(sum);
    }

    void sub(){
        int diff = x - y;
        System.out.println(diff);
    }

    void mul(){
        int prod = x * y;
        System.out.println(prod);
    }

    void div(){
        int quotient = x / y;
        System.out.println(quotient);
    }
    
}

public class Calc {
    public static void main(String[] args){
        MyCalc obj = new MyCalc();
        System.out.println(obj.x);
        System.out.println(obj.y);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }

}
