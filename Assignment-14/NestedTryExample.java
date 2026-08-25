public class NestedTryExample {
    public static void main(String[] args){
            try{
                // Outer try block

                try{
                    // Inner try block
                    int result = 10/0;
                    System.out.println("Result: "+result);
                } catch (ArithmeticException e){
                    System.out.println("Exception: "+e.getMessage());
                    System.out.println("Error: "+e.getClass().getSimpleName()+" occurred");
                }

                //String str = null;
                //System.out.println(str.length());
            } catch (NullPointerException e) {
                System.out.println("Exception: "+e.getMessage());
                System.out.println("Error: "+e.getClass().getSimpleName()+" occurred");
            }
            finally {
                System.out.println("Finally Block executed!");
            }
    }
}
