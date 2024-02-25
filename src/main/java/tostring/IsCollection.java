package tostring;

import comparatordemo.Book;

import java.util.Collection;
import java.util.List;

public class IsCollection {
    public static void main(String[] args) {
        Book book1 = Book.builder()
                .id(1)
                .name("Su ve ceza")
                .page(687)
//                .startDate(date12)
                .isActive(true)
                .build();

        List<Book> bookList = List.of(book1);

//        boolean isCollection = Collection.class.isAssignableFrom(bookList.getClass());
        boolean isCollection = Collection.class.isAssignableFrom(book1.getClass());

        var c = 3;
        System.out.println(isCollection);
    }
//
//    public static boolean isCollection(Object ob) {
//        return ob != null && isClassCollection(ob.getClass());
//    }
}
