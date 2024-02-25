package staticdemo;

public class StaticTest {
    public static void main(String[] args) {

        StaticManager staticManager = new StaticManager();

        staticManager.add(3,5);

        staticManager.addString("a","b");


        StaticManager.addString("a","b");
    }


    public int addX(int i, int j){
        return i+j;
    }

    public static String addStringX(String a, String b){
        return a+b;
    }
}
