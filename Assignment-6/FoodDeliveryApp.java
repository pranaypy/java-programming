class Order{
    String orderId;
    String customerName;
    String deliveryAddress;

    Order(String oId, String n, String add){
        orderId = oId;
        customerName = n;
        deliveryAddress = add;
    }

    class InnerOrder{
        void display(){
            System.out.println("Order ID: "+orderId);
            System.out.println("Customer Name: "+customerName);
            System.out.println("Delivery Address: "+deliveryAddress);
        }
    }

    void placed(){
        System.out.println("Order has been placed");
    }
    void status(){
        System.out.println("Order is being processed");
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args){
        // Using Inner class to display order details
        Order o1 = new Order("12876", "Prashant Singh", "A-504 , Green Park, New Delhi");
        Order.InnerOrder io = o1.new InnerOrder();
        io.display();
        o1.placed();
        o1.status();

        System.out.println("\n");

        // Using Anoymous class to override the method defined in class Order
        Order o2 = new Order("12877", "Rohit Kumar", "B-101 , Blue Ridge, New Delhi"){
            void status(){
                System.out.println("Order is out for delivery");
            }
        };
        o2.placed();
        o2.status();
    }
    
}
