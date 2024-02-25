package listtest;

import comparatordemo.Book;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForEachWithFilterTest {
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

        List<Book> bookList = new ArrayList<>(List.of(book1, book2, book3, book4, book5, book6, book7, book8,book9));

        System.out.println("deste ilk hal : ");
        bookList.forEach(System.out::println);



        //List<Book> perBookList;

//        List<Book> perBookList = null;
//        bookList.forEach(bookCompare -> {
////            List<Book> perBookList = null;
//            //  bookCompare.getName()
//            List<Book> perAdayiBookList = new ArrayList<>();
//            List<Book> perBookList1 = bookList.stream().filter(book -> {
//
//                if (bookCompare.getName().equals(book.getName())) {
//                    perAdayiBookList.add(book);
//                }
//
//                List<Book> perBookList = null;
//                if (perAdayiBookList.size() > 2) {
//                    perBookList = new ArrayList<>(perAdayiBookList);
//
//                    //perBookList in bütün elemanlarını  bookList den sil
//                    bookList.removeAll(perBookList);
//
////                    System.out.println(bookList);
//                    System.out.println("deste son hal : ");
//                    bookList.forEach(System.out::println);
//
//                    System.out.println("per : ");
//                    perBookList.forEach(System.out::println);
//
//
//                }
//
//
//                return true;
//            }).toList();
//
////            return perBookList;
//        });

    }
}
