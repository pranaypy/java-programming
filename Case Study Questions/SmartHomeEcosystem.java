abstract class Device{
    String brand;
    Device(String b){
        brand = b;
    }

    abstract void turnOn();

    public String getBrand(){
        return brand;
    }
}

interface RemoteControllable{
    void connectToWifi();
}

interface PowerSaving{
    void getEneryRating();
}


class SmartTV extends Device implements RemoteControllable, PowerSaving{
    String brand;
    SmartTV(String b){
        super(b);
    }

    void turnOn(){
        System.out.println(getBrand() + " TV is booting up...");
    }

    public void connectToWifi(){
        System.out.println("Connecting to Home_5G...");
    }

    public void getEneryRating(){
        System.out.println(getBrand() + " TV has an energy rating of A+.");
        System.out.println();
    }
}

class ElectricKettle extends Device{
    ElectricKettle(String b){
        super(b);
    }

    void turnOn(){
        System.out.println(getBrand() + " Electric Kettle is turning on...");
        System.out.println();
    }
}

public class SmartHomeEcosystem {
    public static void main(String[] args){
        SmartTV tv = new SmartTV("Sony");
        tv.turnOn();
        tv.connectToWifi();
        tv.getEneryRating();

        Device kettle = new ElectricKettle("Philips");
        kettle.turnOn();
    }
}
