class Vehicle{
    String name;
    String model;
    String color;

    Vehicle(String name, String model, String color){
        this.name = name;
        this.model = model;
        this.color = color;
    }

    class InnerVehicle{
        void display(){
            System.out.println("Vehicle Name: "+name);
            System.out.println("Vehicle Model: "+model);
            System.out.println("Vehicle Color: "+color);
        }
    }

    void action(){
        System.out.println("Vehicle is moving");
    }

}


public class VehicleDetails {
    public static void main(String[] args){
        // Using Inner class to display order details
        Vehicle v = new Vehicle("Mercedes", "Maybach", "Blood Red");
        Vehicle.InnerVehicle iv = v.new InnerVehicle();
        iv.display();
        v.action();

        System.out.println("\n");

        // Using Anoymous class to override the method defined in class Order
        Vehicle v2 = new Vehicle("BMW", "X5", "Black"){
            void action(){
                System.out.println("The BMW is moving fast");
            }
        };
        v2.action();
    }
    
}
