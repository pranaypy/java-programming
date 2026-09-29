class BankAccount{
    int balance = 1000;

    public synchronized void deposit(int amount){
        balance = balance + amount;
        System.out.println("Deposited: "+amount+" | Balance: "+balance);
    }
    
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " +amount+" | Balance: " + balance);
        } 
        else {
            System.out.println("Insufficient Balance");
        }
    }
}

class DepositThread extends Thread{
    BankAccount account;

    DepositThread (BankAccount account){
        this.account = account;
    }

    public void run(){
        for (int i=1; i<=5; i++){
            account.deposit(500);
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class WithdrawThread extends Thread{
    BankAccount account;

    WithdrawThread (BankAccount account){
        this.account = account;
    }

    public void run(){
        for (int i=1; i<=5; i++){
            account.withdraw(700);
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class BankAccountThreds {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        DepositThread d = new DepositThread(account);
        WithdrawThread w = new WithdrawThread(account);

        d.start();
        w.start();
    }
    
}
