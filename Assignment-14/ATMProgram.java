import java.util.Scanner;

public class ATMProgram {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        double balance = 50000.00;

        System.out.println("Welcome to the ATM Program");
        System.out.println("Current Account balance: "+balance+" Rs.");
        System.out.print("Enter amount to be withdrawn: ");
        try (Scanner scan = new Scanner(System.in)){
            double amount = scan.nextDouble();

            if (amount < 1){
                throw new Exception("Invalid amount. Please enter a valid amount greater than 1 Rs..");
            }
            if (amount > balance){
                throw new Exception("Insufficient balance. Please enter a valid amount less than or equal to "+balance+" Rs.");
            }

            // Successful transaction
            balance -= amount;
            System.out.println("Withdrawal of "+amount+" was successful.");
            System.out.println("Current Account balance: "+balance+" Rs.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
}
