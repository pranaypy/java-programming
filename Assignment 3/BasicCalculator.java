class CalcFunctions{
    int a = 2;
    int b = 3;
    int c;

    float p = 1.5f;
    float q = 2.5f;
    float r;

    static int count_calculations = 0; //static variable to count the number of calculations done
    
    CalcFunctions(){
        System.out.println("Default Constructor called:");
    }

    CalcFunctions(int x, int y){
        System.out.println("Parameterized Constructor called for int:");
        a = x;
        b = y;
    }

    CalcFunctions(float x, float y){
        System.out.println("Parameterized Constructor called for float:");
        p = x;
        q = y;
    }


    void add(){ //for deafult constructor 
        c = a+b;
        count_calculations++;
        System.out.println(a+" + "+b+" = "+c+"\n");
    }

    void add(int x, int y){ //for parameterized constructor with int
        c = x+y;
        count_calculations++;
        System.out.println(x+" + "+y+" = "+c+"\n");
    }

    void add(float x, float y){ //for parameterized constructor with float
        r = x+y;
        count_calculations++;
        System.out.println(x+" + "+y+" = "+r+"\n");
    }

    static void showCount(){
        System.out.println("Number of calculations done: "+count_calculations);
    }
}


public class BasicCalculator{
    public static void main(String[] agrs){
        CalcFunctions obj1 = new CalcFunctions();
        obj1.add();

        CalcFunctions obj2 = new CalcFunctions(850312, 756864);
        obj2.add(5, 15);
        obj2.add();

        CalcFunctions obj3 = new CalcFunctions(2.5f, 2.5f);
        obj3.add(2.5f, 2.5f);

        CalcFunctions.showCount();

    }
    
}
