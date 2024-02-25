package collectiontest;

import comparatordemo.AuthorDto;
import comparatordemo.Book;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GetBookList {

    public List<Book> getBooks() {
        Date input = new Date();

        Date date1 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date date6 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(6).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date date8 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(8).atStartOfDay(ZoneId.systemDefault()).toInstant());

        Date date12 = Date.from(LocalDate.ofInstant(input.toInstant(),
                ZoneId.systemDefault()).plusDays(12).atStartOfDay(ZoneId.systemDefault()).toInstant());

        LocalDateTime lt
                = java.time.LocalDateTime.now();


        AuthorDto authorDto = AuthorDto.builder()
                .id(12L)
                .lastName("Tostoyewski")
                .name("Oğuzhan")
                .build();

        Book book1 = Book.builder()
                .id(1)
                .name("Suç ve ceza")
                .page(687)
                .startDate(date12)
                .isActive(true)
                .localDate(lt)
                .authorDto(authorDto)
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
                .isActive(false)
                .build();

        Book book4 = Book.builder()
                .id(4)
                .name("Zlm ve ceza")
                .page(67)
                .startDate(date12)
//                .isActive(false)
                .build();

        Book book5 = Book.builder()
                .id(5)
                .name("Su ve ceza")
                .page(687)
                .startDate(date12)
//                .isActive(false)
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
                .isActive(false)
                .build();

        Book book9 = Book.builder()
                .id(9)
                .name("Su ve ceza")
                .page(687)
                .startDate(date12)
                .isActive(false)
                .build();

        Book book10 = Book.builder()
                .id(10)
                .name("Su ve ceza")
                .page(687)
                .startDate(date12)
                .isActive(false)
                .build();

        List<Book> bookList = new ArrayList<>(List.of(book1, book2, book3, book4, book5, book6, book7, book8, book9, book10));
//        List<Book> bookList = new ArrayList<>(List.of(book1));
//        bookList.forEach(System.out::println);
//        System.out.println("----------getBookList-----------");
        return bookList;
    }
}
