interface Product {
    void displayProductDetails();
}

class Electroics implements Product{
    String name;
    int yr_of_manufacture;
    double price;

    Electroics(String name, int yr_of_manufacture,double price){
        this.name = name;
        this.yr_of_manufacture = yr_of_manufacture;
        this.price = price;
    }

    public void displayProductDetails(){
        System.out.println("Product Name: " + name);
        System.out.println("Year of Manufacture: " + yr_of_manufacture);
        System.out.println("Product Price: $" + price);
    }
}

class Clothing implements Product{
    int obj_id;
    String type;
    String size;
    double price;

    Clothing(int obj_id, String type, String size, double price){
        this.obj_id = obj_id;
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public void displayProductDetails(){
        System.out.println("Object ID: " + obj_id);
        System.out.println("Clothing Type: " + type);
        System.out.println("Clothing Size: " + size);
        System.out.println("Product Price: $" + price);
    }
}

class Groceries implements Product{
    String name;
    String type;
    String expiry_date;
    double price;

    Groceries(String name, String type, String expiry_date, double price){
        this.name = name;
        this.type = type;
        this.expiry_date = expiry_date;
        this.price = price;
    }

    public void displayProductDetails(){
        System.out.println("Product Name: " + name);
        System.out.println("Product Type: " + type);
        System.out.println("Expiry Date: " + expiry_date);
        System.out.println("Product Price: $" + price);
    }
}


public class ProductSystem {
    public static void main(String[] args){
        Electroics e = new Electroics("Samsung Galaxy S26 Ultra", 2026, 150000.99);
        e.displayProductDetails();
        System.out.println();

        Clothing c = new Clothing(101, "Hoodie", "XL", 799.99);
        c.displayProductDetails();
        System.out.println();

        Groceries g = new Groceries("Cheese Cubes", "Dairy", "2026-11-23", 150.00);
        g.displayProductDetails();
    }
    
}
