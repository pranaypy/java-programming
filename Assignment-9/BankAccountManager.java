class BankAcc{
    final int accountNumber; //final variable
    String name;
    int balance;

    BankAcc(String name,int accountNumber, int balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountManager{
    public static void main(String[] args){
        System.out.println("Welcome to the Bank Account");
        BankAcc account = new BankAcc("Akshay Singh", 283746, 50000);
        account.displayAccountDetails();
    }
}