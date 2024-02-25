package splitTest;

public class SplitTest {

    public static void main(String[] args) {

        String a = "1" + "\u2663";

        System.out.println(a);

        System.out.println( a.substring(0,1));

        System.out.println( a.substring(1,2));
    }
}
