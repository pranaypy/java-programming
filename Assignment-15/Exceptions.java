public class Exceptions{
    static void fun(){
        try{
            throw new NullPointerException("demo");
        }
        catch (NullPointerException e){
            System.out.println("Exception thrown by fun: "+e.getMessage());
            System.out.println("Error class: "+e.getClass().getSimpleName());
            System.out.println("Caught inside fun");
            throw e; // rethrowing exception
        }
    }

    public static void main(String[] args){
        try{
            fun();
        }
        catch (NullPointerException e){
            System.out.println("Caught in main");
        }
    }
}


