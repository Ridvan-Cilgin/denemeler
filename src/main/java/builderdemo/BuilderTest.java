package builderdemo;

import objectprimitivedifferance.Book;

public class BuilderTest {
    public static void main(String[] args) {
        Book book = Book.builder()
                .id(1)
                .name("suç ve ceza")
                .pageSize(687)
                .author("Dostoyevski")
                .build();

        System.out.println(book);

//        book = Book.builder()
//                .name("GavGAM")
//                .build();
//
//        System.out.println(book);


        book.setName("Gavgam");




        System.out.println(book);
    }

}
