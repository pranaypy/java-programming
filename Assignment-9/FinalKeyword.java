class FinalKeywordExample {
    final int max = 100; //final avriable

    void display() {
        System.out.println("Max value is: " + max);
    }
    
}

public class FinalKeyword {
    public static void main(String[] args) {
        FinalKeywordExample obj = new FinalKeywordExample();
        obj.display();
    }
    
}
