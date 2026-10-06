class FoodOrderSystem{
    int orderId;

    FoodOrderSystem(int orderId){
        this.orderId = orderId;
    }

    void calculateBill(int price){
        System.out.println("Calculating bill for order ID: " + orderId);
        System.out.println("Final price: "+price);
    }

    void calculateBill(int price, int quantity){
        System.out.println("Calculating bill for order ID: " + orderId);
        System.out.println("Final price: "+price*quantity);
    }

    void calculateBill(int price, int quantity, int deliverCharge){
        System.out.println("Calculating bill for order ID: " + orderId);
        System.out.println("Final price: "+((price*quantity)+deliverCharge));
    }

}

public class SmartBillingSystem {
    public static void main(String[] args){
        FoodOrderSystem o1 = new FoodOrderSystem(1023);
        FoodOrderSystem o2 = new FoodOrderSystem(1025);
        FoodOrderSystem o3 = new FoodOrderSystem(1027);

        o1.calculateBill(500);
        o2.calculateBill(480, 2);
        o3.calculateBill(540, 3,25);
        
    }
    
}
