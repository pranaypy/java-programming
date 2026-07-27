class Bill{
    int bill_amt;
    int discount_amt;
    int final_price;
    
    static int total_order = 0;

    Bill(int amt, int discount){
        bill_amt = amt;
        discount_amt = discount;
    }  

    void calculate_bill(){ //dine-in
        final_price = bill_amt - discount_amt;
        total_order++;
        System.out.println("Bill Amount: " +bill_amt);
        System.out.println("Discount Amount: " +discount_amt);
        System.out.println("Final Price: " +final_price);
    }

    void calculate_bill(int rest_fee){ //takeaway
        final_price = bill_amt - discount_amt + rest_fee;
        total_order++;
        System.out.println("Bill Amount: " +bill_amt);
        System.out.println("Discount Amount: " +discount_amt);
        System.out.println("Restaurant Fee: " +rest_fee);
        System.out.println("Final Price: " +final_price);
    }

    void calculate_bill(int rest_fee, int del_fee){ //delivery
        final_price = bill_amt - discount_amt + rest_fee + del_fee;
        total_order++;
        System.out.println("Bill Amount: " +bill_amt);
        System.out.println("Discount Amount: " +discount_amt);
        System.out.println("Restaurant Fee: " +rest_fee);
        System.out.println("Delivery Fee: " +del_fee);
        System.out.println("Final Price: " +final_price);
    }
}


public class RestaurantBill{
    public static void main(String[] args){
        Bill order1 = new Bill(2600, 150);
        System.out.println("Dine-in Order");
        order1.calculate_bill();

        Bill order2 = new Bill(1800, 250);
        System.out.println("\nTakeaway Order");
        order2.calculate_bill(50);

        Bill order3 = new Bill(2000, 300);
        System.out.println("\nDelivery Order");
        order3.calculate_bill(50, 50);

        System.out.println("\nTotal Orders: " +Bill.total_order);

    }
    
}

