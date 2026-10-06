class VehicleRegistration{
    String registerNo;
    String ownerName;
    String model;
    int manufacYear;

    VehicleRegistration(){
        registerNo = "X01A26";
        ownerName = "John Doe";
        model = "Honda City";
        manufacYear = 2020;
    }

    VehicleRegistration(String regNo, String owner, String mod, int year){
        registerNo = regNo;
        ownerName = owner;
        model = mod;
        manufacYear = year;
    }

    VehicleRegistration(VehicleRegistration v){
        registerNo = v.registerNo;
        ownerName = v.ownerName;
        model = v.model;
        manufacYear = v.manufacYear;
    }

}

public class SmartVehicleRegisteration {
    public static void main(String[] args){
        VehicleRegistration v1 = new VehicleRegistration();
        VehicleRegistration v2 = new VehicleRegistration("Y0A234","Anthony Stark", "Ford Mustang",1967);
        VehicleRegistration v3 = new VehicleRegistration(v2);

        System.out.println("Vehicle 1: " + v1.registerNo + ", " + v1.ownerName + ", " + v1.model + ", " + v1.manufacYear+"\n");
        System.out.println("Vehicle 2: " + v2.registerNo + ", " + v2.ownerName + ", " + v2.model + ", " + v2.manufacYear+"\n");
        System.out.println("Vehicle 3: " + v3.registerNo + ", " + v3.ownerName + ", " + v3.model + ", " + v3.manufacYear);
    }
    
}
