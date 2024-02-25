package booleandemo;

import stackdemo.Book;

public class BooleanAndNullCompareTest {
    public static void main(String[] args) {

        BooleanAndNullCompareTest booleanAndNullCompareTest = new BooleanAndNullCompareTest();
        booleanAndNullCompareTest.extracted();
    }

    public  void extracted() {
        boolean x = true;
        Book book = new Book();
        book.setIsFavorite(true);

        if (book.getIsFavorite() == null) {
            System.out.println("null");
        } else if (x && book.getIsFavorite()) {
            System.out.println("exeption!!!");
        }
    }
}
