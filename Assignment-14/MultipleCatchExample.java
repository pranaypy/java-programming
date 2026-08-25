public class MultipleCatchExample {
    public static void main(String[] args){
        try{
            int result = 10/0;
            System.out.println("Result: "+result);

            //String str = null;
            //System.out.println(str.length());
        } catch (NullPointerException e){
            System.out.println("Error: Null Pointer exception! Object is null.");
        } catch (Exception e) {
            System.out.println("Some other error occurred");
        }


        // One catch for multiple exceptions
        try{
            //String str = null;
            //System.out.println(str.length());

            int result = 10/0;
            System.out.println("Result: "+result);
        } catch (ArithmeticException | NullPointerException e){
            System.out.println("Exception: "+e.getMessage());
            System.out.println("Error: "+e.getClass().getSimpleName()+" occurred.");

        }
        System.out.println("Program continues even after exception occurrence");

    }
}
