package settest;

import comparatordemo.Book;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class DistinctByKeyDemo {
    public static void main(String[] args) {
        Date input = new Date();

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


        System.out.println("-----------------------bütün liste-------------------------------");
        bookList.forEach(System.out::println);

        System.out.println("----------------------- liste distinct-------------------------------");

        bookList.stream().filter(distinctByKey(Book::getName)).forEach(System.out::println);

    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> seen.add(keyExtractor.apply(t));
    }
}
