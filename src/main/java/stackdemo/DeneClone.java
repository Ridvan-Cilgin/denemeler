package stackdemo;

import objectprimitivedifferance.Book;

import java.util.HashSet;
import java.util.List;

public class DeneClone {

    public static void main(String[] args) {


        Book oldBook = Book.builder()
                .id(1)
                .name("suç ve ceza")
                .pageSize(687)
                .author("Dostoyevski")
                .build();


        Book newBook = Book.builder()
                .id(2)
                .name("savaş ve barış")
                .pageSize(1687)
                .author("tolstoy")
                .build();

        List<Book> bookList = List.of(oldBook, newBook);

        HashSet<Book> bookHashset = new HashSet<>();
        bookHashset.add(oldBook);
        bookHashset.add(newBook);

        System.out.println("hashSet : "+bookHashset);

       // HashSet<Book> bookHashset1 = new HashSet<>(oldBook,newBook);



        String name = "suç";

        bookList.stream().filter(o -> o.getName().equals(name)).forEach(
                o -> {
                    System.out.println("var");
                }


                );
//        boolean found = bookList.stream()
//                .anyMatch(b -> b.getName().equals("savaş ve barış"));
//
//        System.out.println(found);
//
//        if (found){
//            System.out.println("evet var");
//        }else {
//            System.out.println("hayır yok");
//
//        }


        if (bookList.stream()
                .anyMatch(b -> b.getName().equals("savaş ve barış"))) {
            System.out.println("evet var");
        } else {
            System.out.println("hayır yok");
        }


//        bookList.stream().forEach( b -> {
//            if("savaş ve barış".equals(b.getName())){
//                System.out.println("evet var");
//
//            } else {
//                System.out.println("hayır yok");
//            }
//
//                });
        Book book21 = new Book();


        System.out.println(book21.getClass());
        System.out.println(book21.getClass().getName());

        System.out.println(book21.toString());

    }



}
