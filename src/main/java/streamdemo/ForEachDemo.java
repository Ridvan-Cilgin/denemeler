package streamdemo;

import java.util.Collections;
import java.util.function.BiConsumer;

public class ForEachDemo {

    static int counter = 10;

    public static void main(String[] args) {
//        IntStream.rangeClosed(1, 8)
//                .forEach(ForEachDemo::printer);

//        IntStream.rangeClosed(1, 8)
//                .forEach(System.out::println);

//        Collections.nCopies(8, 1)
//                .stream()
//                .forEach(i -> System.out.println(i));

        Collections.nCopies(8, 0)
                .stream()
                .forEach(i -> printer());


//
//        IntStream.rangeClosed(1, 8).takeWhile(c -> c / 3 == 0)
//                .forEach(ForEachDemo::printer);
//
//
//        ForEachDemo.repeat =(integer, runnable) -> {
//
//        };
//        ForEachDemo.repeat =(3, printer(3)) -> {
//
//        };
    }

    private static void printer(int i) {

//        System.out.println(counter);
//        counter++;

        System.out.println("hello");
    }


    private static void printer() {

        System.out.println("hello");

    }


    public static BiConsumer<Integer, Runnable> repeat = (n, f) -> {
        for (int i = 1; i <= n; i++)
            f.run();
    };

//    public static Function<Integer, ?> repeat=(n, f) -> {
//        for (int i = 1; i <= n; i++)
//            f.apply(i);
//    };
}
