package streamdemo;

import java.util.function.BiConsumer;

public class ForEachDemo3 {

    static int counter = 10;

    public static void main(String[] args) {
//        IntStream.rangeClosed(1, 8)
//                .forEach(ForEachDemo::printer());





    }

    private static void printer(int i) {

//        System.out.println(counter);
//        counter++;

        System.out.println("hello");
    }






    public static BiConsumer<Integer, Runnable> repeat =(n, f) -> {
        for (int i = 1; i <= n; i++)
            f.run();
    };

//    public static Function<Integer, ?> repeat=(n, f) -> {
//        for (int i = 1; i <= n; i++)
//            f.apply(i);
//    };
}
