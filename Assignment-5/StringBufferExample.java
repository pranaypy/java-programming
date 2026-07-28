public class StringBufferExample {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");
        System.out.println("After Append: "+ sb);

        sb.insert(5,"Java");
        System.out.println("After Insert: "+ sb);

        sb.replace(0,5,"Hi");
        System.out.println("After Replace: "+ sb);

        sb.delete(2,5);
        System.out.println("After Delete: "+ sb);
    }
}
