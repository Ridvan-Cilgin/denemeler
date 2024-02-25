package designpatterns.singleton;

public class A {
   private static A a = new A();
    private A() {
        System.out.println("aaaa");
    }
    public static A getInstance() {
        return a;
    }
}
