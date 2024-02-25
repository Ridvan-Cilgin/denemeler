package objectDemo;

public class ObjectGetClass {

    public static void main(String[] args) {
        Object obj = new String("JavaTpoint");
        Class a = obj.getClass();
        System.out.println("Class of Object obj is : " + a.getName());

        System.out.println(obj.getClass());
    }


}
