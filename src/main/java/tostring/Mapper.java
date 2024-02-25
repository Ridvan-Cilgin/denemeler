package tostring;

import com.fasterxml.jackson.databind.ObjectMapper;
import comparatordemo.Book;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

@RequiredArgsConstructor
public class Mapper {
    private static final ObjectMapper objectMapper = new ObjectMapper();



    public static void main(String[] args) throws IOException {
        Book book1 = Book.builder()
                .id(1)
                .name("Su ve ceza")
                .page(687)
//                .startDate(date12)
                .isActive(true)
                .build();

        String bookString = book1.toString();
        System.out.println(bookString);

        Book book = objectMapper.readValue(bookString, Book.class);
        System.out.println(book);




        String id = "XXX";

        String value = "kaml";

        String xyz = "\"" + id + "\"";
        xyz += " : ";
        xyz += "\"" + value + "\"";
        System.out.println(xyz);

        final StringBuilder sb = new StringBuilder("\"");
        sb.append(id).append("\"").append(" : ").append("\"").append(value).append("\"");

        System.out.println(sb);


        final StringBuilder sb1 = new StringBuilder("\"" + "elma" + "\"").append(" : ").append("\"").append(value).append("\"");

        System.out.println(sb1);


//        final StringBuilder sb2 = new StringBuilder("elma").append(" : ").append("\"").append(value).append("\"");
//
//        System.out.println(sb2);


//        ROM = "\"" + ROM + "\"";
        //"XXX"

//        "id" : "123",
//        System.out.println( "\"" + id + "\"" );
//        " \"ROM\" ";


    }

//    public static Map<String,String> parseMap(String text) {
//        Map<String,String> map = new LinkedHashMap<String,String>();
//        for(String keyValue: text.split(", ")) {
//            String[] parts = keyValue.split("=", 2);
//            map.put(parts[0], parts[1]);
//        }
//        return map;
//    }
}
