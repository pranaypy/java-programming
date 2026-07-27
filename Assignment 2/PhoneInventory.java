class Inventory{
    String ph_name;
    String ph_model;
    String manufacturer;
    String colour;
    String storage;
    String memory;
    int price;

    //Default Constructor
    Inventory(){
        ph_name = "ABC Phone";
        ph_model = "15 Pro Max";
        manufacturer = "ABC.inc";
        colour = "Moonlight";
        storage = "256GB";
        memory = "8GB";
        price = 22000;
    }

    //Parameterized Constructor
    Inventory(String n, String model, String manufac, String c, String stor, String ram, int p){
        ph_name = n;
        ph_model = model;
        manufacturer = manufac;
        colour = c;
        storage = stor;
        memory = ram;
        price = p;
    }

    //Copy Constructor
    Inventory(Inventory i){
        ph_name = i.ph_name;
        ph_model = i.ph_model;
        manufacturer = i.manufacturer;
        colour = i.colour;
        storage = i.storage;
        memory = i.memory;
        price = i.price;
    }

    void display(){
        System.out.println("Phone Name: " +ph_name);
        System.out.println("Phone Model: " +ph_model);
        System.out.println("Manufacturer: " +manufacturer);
        System.out.println("Colour: " +colour);
        System.out.println("Storage: " +storage);
        System.out.println("Memory: " +memory);
        System.out.println("Price: " +price+"\n");
    }
}


public class PhoneInventory{
    public static void main(String[] args){
        Inventory ph1 = new Inventory();
        System.out.println("Default Constructor");
        ph1.display();

        Inventory ph2 = new Inventory("Samsung Galaxy S26 Ultra", "S26 Ultra", "Samsung", "Black", "512GB", "12GB", 145000);
        System.out.println("Parameterized Constructor");
        ph2.display();

        Inventory ph3 = new Inventory(ph2);
        System.out.println("Copy Constructor");
        ph3.display();
    }
    
}
