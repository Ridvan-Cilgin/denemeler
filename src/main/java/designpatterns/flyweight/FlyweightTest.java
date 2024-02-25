package designpatterns.flyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        int a = 127;
        int b = 127;

        if ((a == b)) {
            System.out.println("a ve b eşit");
        }


        int c = 1222234239;
        int d = 1222234239;

        if ((c == d)) {
            System.out.println("c ve d eşit");
        }

    }
}
