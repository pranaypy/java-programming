class DivideByZeroException extends RuntimeException{
    public DivideByZeroException(String m){
        super(m);
    }
}

public class UncheckedCustomExceptions {
    public static void divide(int a, int b){
        if (b==0){
            throw new DivideByZeroException("Cannot divde by zero!");
        }
        System.out.println("Result: "+(a/b));
    }
    
    public static void main(String[] args){
        try{
            divide(10,0);
        } catch (DivideByZeroException e){
            System.out.println("Exception caught: "+e.getMessage());
            System.out.println("Exception class: "+e.getClass().getSimpleName());
        }
        // divide(10,0); //handled at runtime
    }
}
