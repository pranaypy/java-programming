import java.util.Scanner;

public class OnlineShopping {
    public static void main(String[] args) {
        double itemPrice = 250.00; 

        System.out.println("Item: Wireless Earbuds");
        System.out.println("Price per unit: Rs." + itemPrice);
        System.out.print("Enter quantity to purchase: ");

        try (Scanner scan = new Scanner(System.in)) {
            int quantity = scan.nextInt();

            if (quantity <= 0) {
                throw new Exception("Invalid quantity. Please enter a quantity greater than 0.");
            }

            double totalPrice = itemPrice * quantity;
            System.out.println("Order placed successfully!");
            System.out.println("Total Amount to Pay: Rs." + totalPrice);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}