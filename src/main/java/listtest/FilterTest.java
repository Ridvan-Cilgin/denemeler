package listtest;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterTest {
    public static void main(String[] args) {

        Project book1 = new Project();
        book1.setId(1);
        book1.setName("Ne Zaman");

        Project book3 = new Project();
        book3.setId(3);
        book3.setName("Ne Zaman");

        Project book2 = new Project();
        book2.setId(2);
        book2.setName("Suç ve Ceza");


        Project book4 = new Project();
        book4.setId(4);
        book4.setName("Havuz");



        Project book5 = new Project();
        book5.setId(5);
        book5.setName("İzin");


        List<Project> bookList = List.of(book1,book2, book3, book4, book5);

        System.out.println(bookList);

        //best solution for now!
        List<Project> filteredBookList = bookList
                .stream()
                .filter(book -> !Objects.equals(book.getName(), "İzin") && !Objects.equals(book.getName(), "Havuz"))
                .collect(Collectors.toList());
//
        bookList = bookList
                .stream()
                .filter(book -> !Objects.equals(book.getName(), "İzin") && !Objects.equals(book.getName(), "Havuz"))
                .collect(Collectors.toList());

        System.out.println("bookList ezilmiş : "+bookList);


        System.out.println(filteredBookList);

//
//    List<Integer> kitapIdList = bookList
//            .stream()
//            .filter(book -> Objects.equals(book.getName(), "Ne Zaman"))
//            .map(Project::getId).collect(Collectors.toList());
//
//
//        System.out.println(kitapIdList);
    }
}
