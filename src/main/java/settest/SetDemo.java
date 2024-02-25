package settest;

import comparatordemo.Book;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class SetDemo {
    public static void main(String[] args) {
        Date input = new Date();

        Date date1 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date date6 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(6).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date date8 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(8).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date date12 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(12).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Book book1 = Book.builder()
                .id(1)
                .name("Su ve ceza")
                .page(687)
                .startDate(date12)
                .isActive(true)
                .build();

        Book book2 = Book.builder()
                .id(2)
                .name("sava ve bar")
                .page(1687)
                .startDate(date12)
                .isActive(false)
                .build();

        Book book3 = Book.builder()
                .id(3)
                .name("kapitan")
                .page(87)
                .startDate(date8)
                .isActive(true)
                .build();

        Book book4 = Book.builder()
                .id(4)
                .name("Zlm ve ceza")
                .page(67)
                .startDate(date12)
                .isActive(true)
                .build();

        Book book5 = Book.builder()
                .id(5)
                .name("Su ve ceza")
                .page(687)
                .startDate(date12)
                .isActive(true)
                .build();

        Book book6 = Book.builder()
                .id(6)
                .name("kapitan")
                .page(1687)
                .startDate(date12)
                .isActive(false)
                .build();

        Book book7 = Book.builder()
                .id(7)
                .name("kapitan")
                .page(87)
                .startDate(date8)
                .isActive(true)
                .build();

        Book book8 = Book.builder()
                .id(8)
                .name("kapitan")
                .page(67)
                .startDate(date12)
                .isActive(true)
                .build();

        Book book9 = Book.builder()
                .id(9)
                .name("Su ve ceza")
                .page(687)
                .startDate(date12)
                .isActive(true)
                .build();

        Book book10 = Book.builder()
                .id(9)
                .name("Su ve ceza")
                .page(687)
                .startDate(date12)
                .isActive(true)
                .build();

        List<Book> bookList = new ArrayList<>(List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10));

        bookList.forEach(System.out::println);

        System.out.println("------------------------------------------------------");

        Set<Book> bookSet = new HashSet<>(bookList);
        List<Book> list = new ArrayList<>(bookSet);

        list.forEach(System.out::println);
//

//        persons.stream().filter(distinctByKey(Person::getName))

        System.out.println("------------------------------------------------------");

         bookList.stream().filter(distinctByKey(Book::getName)).forEach(System.out::println);

//        Set<Integer> bookPageSet = new HashSet<>();
//
//        bookList.forEach(book -> bookPageSet.add(book.getPage()));
//
//        System.out.println(bookPageSet);
//
//        bookPageSet.forEach(System.out::println);



//        for (Integer page :
//             bookPageSet) {
//            System.out.println(page);
//        }
    }
    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
}
//
//    public static <T> Predicate<T> distinctByKey(
//            Function<? super T, ?> keyExtractor) {
//
//        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
//        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
//    }
//    To test it, we'll use the following Person class that has the attributes age, email, and name:
//
//public class Person {
//    private int age;
//    private String name;
//    private String email;
//    // standard getters and setters
//}
//    And to get a new filtered collection by name, we can use:
//
//        List<Person> personListFiltered = personList.stream()
//        .filter(distinctByKey(p -> p.getName()))
//        .collect(Collectors.toList());