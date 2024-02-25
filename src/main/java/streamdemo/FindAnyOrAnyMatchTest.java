package streamdemo;

import comparatordemo.AuthorDto;
import comparatordemo.Book;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class FindAnyOrAnyMatchTest {
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
//                .isActive(true)
                .localDate(lt)
                .authorDto(authorDto)
                .build();

        Book book2 = Book.builder()
                .id(2)
                .name("sava ve bar")
                .page(1687)
                .startDate(date12)
//                .isActive(false)
                .build();

        Book book3 = Book.builder()
                .id(3)
                .name("kapitan")
                .page(87)
                .startDate(date8)
//                .isActive(false)
                .build();

        Book book4 = Book.builder()
                .id(4)
                .name("Zlm ve ceza")
                .page(67)
                .startDate(date12)
                .isActive(false)
                .build();

        Book book5 = Book.builder()
                .id(5)
                .name("Su ve ceza")
                .page(687)
                .startDate(date12)
                .isActive(false)
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

        List<Book> bookList = new ArrayList<>(List.of(book10, book2, book3, book4, book5, book6, book7, book8, book9));
//        List<Book> bookList = new ArrayList<>(List.of(book1));
        bookList.forEach(System.out::println);

        System.out.println("------------------------------------------------------");
//
//        System.out.println(bookList.stream().anyMatch(book11 -> book11.getIsActive().equals(false)));

//        System.out.println(bookList.stream().filter(book11 -> book11.getIsActive().equals(true)));

//        System.out.println(bookList.stream().filter(book11 -> book11.getIsActive().equals(true)).findAny().isPresent());

//        for (Book book : bookList) {
//            if (book.getIsActive()) {
//                System.out.println(book);
//            }
//        }
//        for (Book book : bookList) {
//            if (!book.getIsActive()) {
//                System.out.println(book);
//            }
//        }

//        List<Integer> sortedList = numberlist.stream().sorted().collect(Collectors.toList());
//
//        List<Book> sortedBookList = bookList.stream().sorted().collect(Collectors.toList())

// 1. yöntem
//        Comparator<Book> bookComparator = Comparator.comparing(Book::getIsActive);
//        List<Book> sortedBooks = bookList.stream().sorted(bookComparator).toList();
//        sortedBooks.forEach(System.out::println);
//
//
//
//        System.out.println("-----------------------toString-------------------------------");
//
//        System.out.println(book1.getLocalDate().toString());


//        System.out.println(bookList.stream().anyMatch(book -> book.getIsActive().equals(true)));
        Optional<Book> book41 = bookList.stream().filter(book -> {
            if (!Objects.isNull(book.getIsActive()) && book.getIsActive().equals(true)) {
                return true;
            }

            return false;

        }).findAny();

        Book book42 = new Book();

        book42.setIsActive(book1.getIsActive());


        System.out.println("book42---------> " +book42);

        if (book41.isPresent()) {
            System.out.println("active ------->");
            System.out.println(book41);

        } else {
            System.out.println("No active !!");
        }

//        boolean isNull = Objects.isNull(book1.getAuthorDto());
//
//        System.out.println("isNull ------->");
////        System.out.println(isNull);
//
//
//        System.out.println((Objects.isNull(book1.getAuthorDto())
//                ? "wer" : book1.getAuthorDto().getName()));
//
//        System.out.println("hotfix ------->");
//

//        List<Book> changedBooks = bookList.stream().map(b -> {
//            b.setName("P");
//            return b;
//
//        }).collect(Collectors.toList());

//        List<Book> changedBooks = bookList.stream().peek(b -> b.setName("P")).toList();
//
//        changedBooks.forEach(System.out::println);
//
//        BookList bookList1 = new BookList();
//
////        bookList1.setBookList(changedBooks);
//        bookList1.setBookList(null);
//        System.out.println("bookLİst1  ------->");
//
//        System.out.println(bookList1);
////        bookList1.getBookList().forEach(System.out::println);
//
//
//        List<Book> changedBooks1 = bookList.stream().map(b -> {
//            b.setName("P");
//            return b;
//        }).toList();
//
//        //id ile listede eşleşme var mı ?
//        //varsa bu id passive mi?
//        boolean isNotRemind = bookList.stream().noneMatch(book -> {
//
//            boolean isEqual = Objects.equals(book.getId(), 10);
//
//            if (isEqual) {
//                boolean isPassive = Objects.equals(book.getIsActive(), false);
//                if (isEqual || isPassive) {
//                    return true;
//                }
//            }
//
//
//            return false;
//        });


//        boolean isRemind1 = bookList.stream().noneMatch(book -> {
//            boolean isEqual = Objects.equals(book.getId(), 1);
//            boolean isPassive = Objects.equals(book.getIsActive(), false);
//            return !isEqual && !isPassive;
//        });


//        if (isNotRemind) {
//            System.out.println("remenind yok");
//        } else {
//            System.out.println("remenind var");
//        }


//        if (bookList.stream().noneMatch(book ->Objects.equals(book.getId(), 10))) {
//            System.out.println("eşleşme yok");
//            boolean isEqual = false;
//        } else if (bookList.stream().noneMatch(book ->Objects.equals(book.getId(), 10))) {
//
//            System.out.println("eşleşme var");
//            boolean isEqual = true;
//        }


//        boolean x = bookList.stream().anyMatch(book21 -> {
//
//            if (Objects.equals(book21.getId(), 10)) {
//                return !book21.getIsActive();
//
//            }
//            return false;
//        });


//        System.out.println("xxxxxxxxx -----> " + x);
//
//        if (bookList.stream().noneMatch(book -> Objects.equals(book.getId(), 10)) || bookList.stream().anyMatch(book21 -> {
//
//            if (Objects.equals(book21.getId(), 10) ) {
//                return !book21.getIsActive();
//            }
//            return false;
//        })) {
//            System.out.println("reminder yok");
//        } else {
//            System.out.println("reminder var");
//        }

//        System.out.println("xxxxxxxxx -----> " + x);
//
//        if (bookList.stream().noneMatch(book -> Objects.equals(book.getId(), 10)) || bookList.stream().anyMatch(book21 -> {
//
//            if (Objects.equals(book21.getId(), 10) && !book21.getIsActive()) {
//                System.out.println("eşit ve pasif");
//                return true;
//            }
//            return false;
//        })) {
//            System.out.println("reminder yok");
//        } else {
//            System.out.println("reminder var");
//        }

//        System.out.println("xxxxxxxxx -----> " + x);
//
//        if (bookList.stream().noneMatch(book -> Objects.equals(book.getId(), 10)) || bookList.stream().anyMatch(book21 -> true && true
//        )) {
//            System.out.println("reminder yok");
//        } else {
//            System.out.println("reminder var");
//        }
    }
}
