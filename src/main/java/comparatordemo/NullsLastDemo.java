package comparatordemo;

import collectiontest.GetBookList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NullsLastDemo {
    public static void main(String[] args) {
        GetBookList getBookList = new GetBookList();
        List<Book> bookList = getBookList.getBooks();


        bookList.forEach(System.out::println);
        System.out.println("----------------------");

//        bookList.sort(Comparator.nullsFirst(
//                Comparator.comparing(
//                        Book::getIsActive)).reversed());
//
//        bookList.forEach(System.out::println);
//        System.out.println("----------------------");


        Comparator<Book> bookComparator = Comparator.comparing(Book::getIsActive,
                Comparator.nullsFirst(Comparator.naturalOrder()));


//        Comparator<Book> bookComparator = Comparator.comparing(Book::getIsActive);
//                .thenComparing(Book::getIsActive);
//                .thenComparing(Book::getPage);

//.nullsLast(Comparator.naturalOrder())

          List<Book> sortedBooks = bookList.stream().sorted(bookComparator.reversed()).collect(Collectors.toList());

        sortedBooks.forEach(System.out::println);
    }

}
