import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args){
        String str = "Java,Python,C++,JavaScript";
        StringTokenizer st = new StringTokenizer(str,",");

        System.out.println(st);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}
