public class ATMAuthentication {
    public void Authenticate(String inp_pin){
        String pin = "178267";
        if (inp_pin != pin){
            throw new IllegalArgumentException("PIN is incorrect");
        }
        else{
            System.out.println("Login Successful");
        }
    }
    
    public static void main(String[] args){
        ATMAuthentication login = new ATMAuthentication();
        try{
            login.Authenticate("178256");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println("Error class: "+e.getClass().getSimpleName());
        }
        finally {
            System.out.println("Login attempt finished. Closing session.");
        }
    }
}
    

