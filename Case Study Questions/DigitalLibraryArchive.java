abstract class LibraryItem {
    private String itemId;
    private String title;
    boolean isReserved;

    LibraryItem(String id, String t) {
        itemId = id;
        title = t;
        isReserved = false;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    void showDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
    }

    abstract void processLoan();
}



class TextBook extends LibraryItem {
    TextBook(String id, String t) {
        super(id, t);
    }

    void processLoan() {
        if (!isReserved) {
            isReserved = true;

            System.out.println("Textbook '" + getTitle()+ "' issued for 14 days.");
        }
        else {
            System.out.println("Error: '" + getTitle()+ "' is already on loan.");
        }
    }
}


class ResearchPaper extends LibraryItem {
    ResearchPaper(String id, String t) {
        super(id, t);
    }

    void processLoan() {
        System.out.println("Generating secure PDF download link...");
        System.out.println("Research paper '" + getTitle()+ "' is available for access.");
    }
}


public class DigitalLibraryArchive {
    public static void main(String[] args) {
        TextBook book = new TextBook("B101", "Java Core");
        book.processLoan();
        System.out.println();

        book.processLoan();
        System.out.println();


        ResearchPaper paper = new ResearchPaper("R99", "AI Ethics");
        paper.processLoan();
        System.out.println();


        book.showDetails();
        System.out.println();
        paper.showDetails();
    }
}