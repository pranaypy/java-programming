abstract class Orders {
    abstract void calculateBill();

    double foodCost;

    public Orders(double foodCost) {
        this.foodCost = foodCost;
    }

}


class DineIn extends Orders {
    double serviceCharge = 50.0;

    public DineIn(double foodCost) {
        super(foodCost);
    }

    void calculateBill() {
        System.out.println("Dine-In Total Bill: Rs." + (foodCost + serviceCharge));
    }
}

class TakeAwayOrder extends Orders {
    private double packagingFee = 20.0;

    public TakeAwayOrder(double foodCost) {
        super(foodCost);
    }

    void calculateBill() {
        System.out.println("Take-Away Total Bill: Rs." + (foodCost + packagingFee));
    }
}

public class FoodOrder {
    public static void main(String[] args) {
        Orders dineIn = new DineIn(500.00);
        Orders takeAway = new TakeAwayOrder(340.00);

        dineIn.calculateBill();
        takeAway.calculateBill();
    }
}
