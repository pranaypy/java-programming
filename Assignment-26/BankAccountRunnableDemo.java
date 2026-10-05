class BankAccountRunnable {
    int balance = 1000;

    public synchronized void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

class DepositTask implements Runnable {
    BankAccountRunnable account;

    DepositTask(BankAccountRunnable account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            account.deposit(500);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class WithdrawTask implements Runnable {
    BankAccountRunnable account;

    WithdrawTask(BankAccountRunnable account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            account.withdraw(700);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankAccountRunnableDemo {
    public static void main(String[] args) {
        BankAccountRunnable account = new BankAccountRunnable();

        DepositTask depositTask = new DepositTask(account);
        WithdrawTask withdrawTask = new WithdrawTask(account);

        Thread thread1 = new Thread(depositTask);
        Thread thread2 = new Thread(withdrawTask);

        thread1.start();
        thread2.start();
    }
}