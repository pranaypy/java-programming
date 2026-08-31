package library;

public class Library {
    String bookName;
    int bookID;
    String author;
    double price;

    public Library(int bID, String bname, String a, double p){
        bookID = bID;
        bookName = bname;
        author = a;
        price = p;
    }

    public void displayDetails(){
        System.out.println("-------- BOOK DETAILS --------");
        System.out.println("Book ID: "+bookID);
        System.out.println("Name: "+bookName);
        System.out.println("Author: "+author);
        System.out.println("Price: ₹"+price);
        System.out.println("------------------------------\n");
    }
    
}
