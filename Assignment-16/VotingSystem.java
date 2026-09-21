class UnderagedException extends Exception{
    public UnderagedException(String m){
        super(m);
    }
}

public class VotingSystem {
    
    public static void ageValidation(int age) throws UnderagedException {
        if (age < 18){
            throw new UnderagedException("Person must be 18 or above to cast their vote");
        }
        System.out.println("Valid age: "+age);
    }

    public static void main(String[] args){
        try{
            ageValidation(17);
        }
        catch (UnderagedException e){
            System.out.println("Caught Exception: "+e.getMessage());
            System.out.println("Exception class: "+e.getClass().getSimpleName());
        }
    }
}
