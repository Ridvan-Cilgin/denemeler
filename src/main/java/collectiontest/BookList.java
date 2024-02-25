package collectiontest;

import comparatordemo.Book;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BookList {

//    GetBookList getBookList = new GetBookList();
//    List<Book> books = getBookList.getBooks();

    public static List<Book> cloneList(List<Book> list) throws CloneNotSupportedException {
        List<Book> clone = new ArrayList<>(list.size());
        for (Book item : list) clone.add((Book) item.clone());
        return clone;
    }
}
