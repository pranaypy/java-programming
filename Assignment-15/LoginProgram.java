public class LoginProgram{
    public void Login(String passwd){
        String password = "abc8637de";
        if (passwd != password){
            throw new IllegalArgumentException("Password is incorrect");
        }
        else{
            System.out.println("Login Successful");
        }
    }
    
    public static void main(String[] args){
        LoginProgram login = new LoginProgram();
        try{
            login.Login("abc8637df");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Login attempt finished. Closing session.");
        }
    }
}