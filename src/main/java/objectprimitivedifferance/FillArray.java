package objectprimitivedifferance;

import java.util.ArrayList;
import java.util.List;

public class FillArray {
    public static void main(String[] args) {

        FillArray f = new FillArray();

        System.out.println(f.fillArrayWithPrimitive(5));
        System.out.println(f.fillArrayWithSameObject(5));
        System.out.println(f.fillArrayWithDifferentObject(5));

    }

    public List<Integer> fillArrayWithPrimitive(int number) {

        int x = 1;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < number; i++) {

            result.add(x);
            x++;
        }

        return result;
    }


    public List<Book> fillArrayWithSameObject(int number) {

        Book book = new Book();

        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < number; i++) {

            book.setId(i);
            book.setName(i + ". kitap ");
            book.setPageSize(i * 100);
            book.setAuthor(i + ". yazar");

            bookList.add(book);

        }
        return bookList;
    }

    public List<Book> fillArrayWithDifferentObject(int number) {

        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < number; i++) {

//            Book book = new Book();
//
//
//            book.setId(i);
//            book.setName(i + ". kitap ");
//            book.setPageSize(i * 100);
//            book.setAuthor(i + ". yazar");


            Book book = Book.builder()
                    .id(i)
                    .name(i + ". kitap ")
                    .pageSize(i * 100)
                    .author(i + ". yazar")
                    .build();

            bookList.add(book);

        }
        return bookList;
    }


    //1-bla bla class ını oluştur
    //2-filan methdunu yaz ------> int value parameter  alsın
    //3- hafıza at ordan oku bunları şuraya al
    //4- xxxx işlevini yap
    //5- zzzzzzzzzzzz

}
