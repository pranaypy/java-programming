class UnderagedDriverException extends Exception{
    public UnderagedDriverException(String m){
        super(m);
    }
}

public class DrivingAge {
    public static void driverValidate(int age) throws UnderagedDriverException{
        if (age < 18){
            throw new UnderagedDriverException("Age must be 18 or above");
        }
        System.out.println("Valid age to drive: "+age);
    }

    public static void main(String[] args){
        try{
            driverValidate(18);
        } catch (UnderagedDriverException e){
            System.out.println("Caught Exception: "+e.getMessage());
            System.out.println("Exception class: "+e.getClass().getSimpleName());
        }

    }
    
}
