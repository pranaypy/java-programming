
class Vehicle {
    String model;
    double price;

    Vehicle(String m, double p) {
        model = m;
        price = p;
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

class CarInsurance extends Vehicle {
    int safetyRating; 

    public CarInsurance(String model, double price, int rating) {
        super(model, price); 
        safetyRating = rating;
    }

    public void displayData() {
        double premium = price * 0.05; 
        

        super.displayInfo(); 
        System.out.println("Safety Rating: " + safetyRating + " Stars");
        System.out.println("Insurance Premium: " + premium);
    }
}

public class VehicleInsurance {
    public static void main(String[] args) {
        CarInsurance car = new CarInsurance("Volkswagen Taigun", 2500000, 5);
        System.out.println("--- Car Details ---");
        car.displayData();
    }
}