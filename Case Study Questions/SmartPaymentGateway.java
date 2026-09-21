abstract class Payments{
    private String transactionId;

    Payments(String tID) {
        transactionId = tID;
    }

    public String getTransactionId() {
        return transactionId; 
    }

    abstract void processPayment();
}


class CreditCardPayment extends Payments{
    double amount;

    CreditCardPayment(String tID,double amt) {
        super(tID);
        amount = amt;
    }

    void processPayment() {
        System.out.println("Processing credit card payment...");
        double txn_fee = amount*0.02;
        double final_amt = amount + txn_fee;
        System.out.println("Transaction Fee: " + txn_fee);
        System.out.println("Final Amount: " + final_amt);
        System.out.println("Transaction ID: " + getTransactionId());
        System.out.println();
    }
}

class UPIPayment extends Payments{
    double amount;
    
    UPIPayment(String tID,double amt) {
        super(tID);
        amount = amt;
    }

    void processPayment() {
        System.out.println("Processing UPI payment...");
        System.out.println("Final Amount: " + amount);
        System.out.println("Transaction ID: " + getTransactionId());
        System.out.println();
    }
}
public class SmartPaymentGateway {
    public static void main(String[] args){
        
        Payments payment1 = new CreditCardPayment("TXN12A6B7", 52300.0);
        payment1.processPayment();
        
        Payments payment2 = new UPIPayment("TXN12C8D9", 7950.0);
        payment2.processPayment();

        Payments[] payments = {
            new CreditCardPayment("TXN12A6B7", 1000.0),
            new UPIPayment("TXN12C8D9", 150.0)
        };

        for (Payments p : payments) {
            p.processPayment();   
            System.out.println();
        }
    }
    
}
