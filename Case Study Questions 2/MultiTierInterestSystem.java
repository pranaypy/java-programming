class Account{
    int balance;
    public Account (int bal){
        balance = bal;
    }

    void calculateInterest(){
        double interest = balance * 0.02;
        System.out.println("Interest calculated: "+interest+"\n");
    }
}

class SavingsAccount extends Account{
    SavingsAccount(int bal){
        super(bal);
    }
    void calculateInterest(){
        double interest = balance * 0.04;
        if (balance > 50000){
            int loyalBonus = 500;
            System.out.println("Interest calculated: "+interest);
            System.out.println("Loyalty Bonus: "+loyalBonus);
            System.out.println("Final Interest calculated: "+(interest+loyalBonus)+"\n");
        }
        else{
            System.out.println("Interest calculated: "+interest+"\n");
        }   
    }
}

class FixedDeposit extends SavingsAccount{
    FixedDeposit(int bal){
        super(bal);
    }

    void calculateInterest(){
        double interest = balance * 0.04;
        double additionalBonus = balance*0.02;
        double finalInterest = interest+additionalBonus;

        if (balance > 50000){
            int loyalBonus = 500;
            System.out.println("Interest calculated: "+finalInterest);
            System.out.println("Loyalty Bonus: "+loyalBonus);
            System.out.println("Final Interest calculated: "+(finalInterest+loyalBonus)+"\n");
        }
        else{
            System.out.println("Interest calculated: "+finalInterest+"\n");
        }   
    }

}
public class MultiTierInterestSystem {
    public static void main(String[] args){
        SavingsAccount s1 = new SavingsAccount(10000);
        SavingsAccount s2 = new SavingsAccount(60000);
        FixedDeposit fd1 = new FixedDeposit(60000);

        s1.calculateInterest();
        s2.calculateInterest();
        fd1.calculateInterest();
    }
    
}
