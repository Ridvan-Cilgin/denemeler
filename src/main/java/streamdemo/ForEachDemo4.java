package streamdemo;

import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ForEachDemo4 {

    static Random random = new Random();



    public static void main(String[] args) {
//        Stream.of("cat", "dog", "elephant", "fox", "rabbit", "duck")
//                .takeWhile(n -> n.length() % 2 != 0)
//                .forEach(System.out::println);

//        Stream.iterate(0, i -> i + 1)
//                .forEach(System.out::println);


//        Stream.iterate(0, i -> i + 1)
//                .peek(System.out::println)
//                .allMatch(i -> i < 9);
//
//        Stream.iterate(0, i -> i < 10, i -> i + 1)
//                .forEach(System.out::println);

//        Stream.iterate(0, i -> i < 3, i -> i + 1)
//                .forEach(printer());

//
//                Stream.iterate(0, i -> i < 10, i -> i + 1)
//                .forEach(n -> printer());

//        for (int i = 0; i < 3; i++) {
//            printer();
//            if (randomABoolean) {
//                System.out.println("şart sağlandı");
//                break;
//            }
//
//        }
//
//        Stream.iterate(0, n -> n + 1)
//                .limit(3)
//                .forEach(x -> {
//                    printer();
//                    if (random.nextBoolean()){
//                        System.out.println("çalıştı");
//
//                    }
//                        }
//
//                );


//        IntStream.range(0, 4).filter(i -> predicater()).findFirst();

        Stream.iterate(0, n -> n + 1)
                .limit(3)
                .filter(x -> predicater()).findFirst();



//        // çalıştı
//        Stream.iterate(0, n -> n + 1)
//                .limit(3)
//                .forEach(x -> printer());
//
//
//        // çalıştı
//        IntStream.range(0, 4).forEach(i -> printer());
//
//        // çalıştı
//        repeat(3, () -> printer());
//        repeat(3, ForEachDemo4::printer);


    }
    static void repeat(int count, Runnable action) {
        IntStream.range(0, count).forEach(i -> action.run());
    }


    private static void printer() {

        System.out.println("hello");

    }


    public static <T> void forEachConditional(Iterable<T> source,
                                              Predicate<T> action) {
        for (T item : source) {
            if (!action.test(item)) {
                break;
            }
        }
    }

    public static Boolean predicater(){
        System.out.println("predicate");
        return random.nextBoolean();
    }


}
