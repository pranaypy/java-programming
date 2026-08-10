class Book{
    final String ISBN; //final variable
    String title;
    String author;
    Double price;

    Book(String title, String author, String ISBN, Double price){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBookDetails() {
        System.out.println("Book Details:");
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Library {
    public static void main(String[] args){
        System.out.println("Welcome to the Library");
        Book b1 = new Book("The Alchemis", "Paulo Coelho", "9780061122415", 350.00);
        b1.displayBookDetails();
    }
}
