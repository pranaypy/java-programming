class InvaildAgeException extends Exception{
    public InvaildAgeException(String m){
        super(m); // message
    }
}

public class CustomExceptions {
    public static void validate(int age) throws InvaildAgeException{
        if (age < 18){
            throw new InvaildAgeException("Age must be 18 or above");
        }
        System.out.println("Valid age: "+age);
    }

    public static void main(String[] args){
        try{
            validate(12);
        } catch (InvaildAgeException e){
            System.out.println("Caught Exception: "+e.getMessage());
            System.out.println("Exception class: "+e.getClass().getSimpleName());
        }

    }
}
