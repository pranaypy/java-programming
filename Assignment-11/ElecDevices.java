interface Switchable{
    void turnOn();
}

class LightBulb implements Switchable{
    public void turnOn(){
        System.out.println("Light bulb has been turned on");
    }
}

class Fan implements Switchable{
    public void turnOn(){
        System.out.println("Fan has been turned on");
    }
}

public class ElecDevices {
    public static void main(String[] args) {
        LightBulb l1 = new LightBulb();
        Fan f1 = new Fan();

        l1.turnOn();
        f1.turnOn();
    }
    
}
