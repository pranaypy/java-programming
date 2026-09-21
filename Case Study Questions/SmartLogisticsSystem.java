abstract class Transport{
    String tarckingId;
    String destination;

    Transport(String tID, String dest){
        tarckingId = tID;
        destination = dest;
    }

    String getTrackingId(){
        return tarckingId;
    }

    String getDestination(){
        return destination;
    }

    abstract void dispatch();
}

interface GPS{
    void getCoordinates();
    default void pingServer(){
        System.out.println("Status: Online");
    };
}

interface Autonomous{
    void selfNavigate();
}


class DeliveryDrone extends Transport implements GPS, Autonomous{
    String droneId;
    DeliveryDrone(String dID, String tID, String dest){
        super(tID, dest);
        droneId = dID;
    }

    void dispatch(){
        System.out.println("Dispatching drone to " + getDestination() + "...");
        System.out.println("Tracking ID: " + getTrackingId());
        System.out.println();
    }

    public void getCoordinates(){
        System.out.println("Drone " + droneId + " is at coordinates: 37.7749° N, 122.4194° W");
    }

    public void selfNavigate(){
        System.out.println("Drone " + droneId + " is navigating autonomously to " + getDestination() + ".");
        System.out.println();
    }

}
public class SmartLogisticsSystem {
    public static void main(String[] args){
        DeliveryDrone drone1 = new DeliveryDrone("DRN001", "TRK12A75", "San Francisco");
        drone1.dispatch();
        drone1.getCoordinates();
        drone1.selfNavigate();

        DeliveryDrone drone2 = new DeliveryDrone("DRN002", "TRK67C90", "Los Angeles");
        drone2.dispatch();
        drone2.pingServer();
        drone2.getCoordinates();
        drone2.selfNavigate();

    }
}
