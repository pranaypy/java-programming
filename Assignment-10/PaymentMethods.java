abstract class Payment {
    abstract void transaction();

    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

}

class CreditCard extends Payment {
    String cardNumber;

    CreditCard(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    void transaction() {
        System.out.println("Transaction of Credit Card payment of Rs." + amount + " using Card: " + cardNumber + " is successful.");
    }
}


class UPI extends Payment {
    String upiId;

    UPI(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    void transaction() {
        System.out.println("Transaction of UPI payment of Rs." + amount + " using UPI ID: " + upiId + " is successful.");
    }
}


public class PaymentMethods {
    public static void main(String[] args) {
        Payment card = new CreditCard(250.50, "5619-3452-9012");
        Payment upi = new UPI(150.00, "aksingh@oksbi");

        card.transaction();
        upi.transaction();
    }
}
