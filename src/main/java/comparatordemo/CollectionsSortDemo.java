package comparatordemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionsSortDemo<T> {

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

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
//                .isActive(true)
                .build();

        Book book4 = Book.builder()
                .id(4)
                .name("Zlm ve ceza")
                .page(67)
                .startDate(date12)
                .isActive(true)
                .build();

        List<Book> bookList = new ArrayList<>(List.of(book1, book2, book3, book4));

        Date startDate = new Date();
        Comparator<Book> bookComparator = Comparator
                .comparing(Book::getIsActive);
//                .thenComparing(Book::getIsActive);
//                .thenComparing(Book::getPage);

//.nullsLast(Comparator.naturalOrder())

//          List<Book> sortedBooks = bookList.stream().sorted(bookComparator.reversed()).collect(Collectors.toList());

//        List<Book> sortedBooks =
//                bookList.sort(Comparator.nullsLast(Comparator.comparing(Book::getIsActive)));

        bookList.sort(Comparator.nullsLast(
                Comparator.comparing(
                        Book::getIsActive)));


//                .stream().sorted(bookComparator.reversed()).collect(Collectors.toList());

//        CollectionsSortDemo collect = new CollectionsSortDemo();

//        List<Book> sortedBooks = collect.sort(bookList, bookComparator);

//        List<Book> sortedBooks = collect.sort(bookList, Comparator.nullsLast(Comparator.comparing(Book::getIsActive)));

//        Collections.sort(bookList, Comparator.nullsLast(Comparator.comparing(Book::getIsActive).reversed()));

        bookList.forEach(System.out::println);
        System.out.println("----------------------");
//        sortedBooks.forEach(System.out::println);

//        ComparatorChain chain = new ComparatorChain(Arrays.asList(
//                new BeanComparator("size"),
//                new BeanComparator("nrOfToppings"),
//                new BeanComparator("name")));
//
//        Collections.sort(pizzas, chain);


    }

//    public List<Book> sortCustomerProduct(List<Book> productList, ){
//
//    }
//
//

//    MultiComparator multiComparator = new MultiComparator();

//    multiComparator.sort(bookList,)
//
//    public Comparator<Book> bookComparator(Date startDate, Boolean isActive) implements Comparator<T>{
//
//
//        Comparator<Book> bookComparator = Comparator.comparing(Book::getStartDate)
//                .thenComparing(Book::getIsActive);
//    }

    public List<T> sort(List<T> list, Comparator<T> c) {
        return list.stream().sorted(c.reversed()).collect(Collectors.toList());
    }

//    public Comparator<T> comparator(T t, List<T> list){
//
//
//        Comparator.comparing(T::list.get(0))
//                .thenComparing(T::getIsActive)
//                .thenComparing(T::getPage);
//    }


}
