package collectiontest;

import comparatordemo.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CopyArrayListTest {
    public static void main(String[] args) throws CloneNotSupportedException {
//        GetBookList getBookList = new GetBookList();
//
//       List<Book> bookList = getBookList.getBooks();
//
////       List<Book> copyList = new ArrayList<>(bookList);
//
//
//        List<Book> copyList = bookList.stream().peek(b -> {
//            b.setIsActive(true);
//        }).collect(Collectors.toList());
//
//
//        System.out.println("----------------copy list----------------");
//        copyList.forEach(System.out::println);
//
//        System.out.println("----------------original list----------------");
//        bookList.forEach(System.out::println);

        GetBookList getBookList = new GetBookList();

//        BookList booklist111 = new BookList();
        List<Book> bookList = getBookList.getBooks();

//        Book

//       List<Book> copyList = new ArrayList<>(bookList);
        List<Book> copyList = new ArrayList<>();
        copyList = BookList.cloneList(getBookList.getBooks());

//         Collections.copy(copyList, bookList);
//          copyList.addAll(bookList);
//       copyList = List.copyOf(bookList);

//        copyList = bookList.stream().map(b -> b).collect(Collectors.toList());


//       copyList.addAll(bookList);

//        List<Book> copyListw = (List<Book>)((List<Book>) bookList).clone();

//        ArrayList<Book> copyList2 = (ArrayList<Book> )  bookList.clone()


       copyList = copyList.stream().peek(b -> {
            b.setIsActive(true);
        }).collect(Collectors.toList());


        System.out.println("----------------copy list----------------");
        copyList.forEach(System.out::println);

        System.out.println("----------------original list----------------");
        bookList.forEach(System.out::println);
    }
}
