public class Narrowing {
    public static void main(String[] args){
        //Narrowing -> converting larger datatype to smaller one
        
        Double obj = 25.75;
        Double obj2 = 26.87;

        int x = obj.intValue();
        int y = (int)(double)(obj2);

        System.out.println("Larger wrapper class to smaller datatype: "+x);
        System.out.println("Larger wrapper class to smaller datatype: "+y);
    }
    
}
