package iftest;

import stackdemo.Book;

public class IfDemo2 {
    public static void main(String[] args) {
        boolean isFavorite;

        Book book1 = getBook(true);

        Book book2 = getBook(false);


//
//        if (book.getIsFavorite() == null){
//            book.setIsFavorite(false);
//        }else {
////            System.out.println("dolu");
//        }

//        System.out.println(book);

        int x = 5;
        int y = 4;
        String z = (x > y) ? "dolu" : "boş";


//        System.out.println(z);


        if (book2.getIsFavorite() == null || book2.getIsFavorite()) {
            System.out.println("hata");
        }

//        if ((book.getIsFavorite() == null) ? System.out.println("dolu") : System.out.println("boş") )
    }

    private static Book getBook(boolean isFavorite) {
        Book book = new Book();
        book.setIsFavorite(isFavorite);
        return book;
    }
}
