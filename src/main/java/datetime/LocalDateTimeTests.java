package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTests {
    public static void main(String[] args) {
        // create an LocalDateTime object
        LocalDateTime lt
                = LocalDateTime.now();

        // print result
        System.out.println("LocalDateTime : "
                + lt);

        String stringLocalDateTime = LocalDateTime.now().toString();
        System.out.println("string date : " + stringLocalDateTime);

//
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        String dateString = "14/07/2018";

        //string to date
//        LocalDate localDate = LocalDate.parse(dateString, dateTimeFormatter);
//        LocalDateTime localDateTime1 = localDate.atStartOfDay();
//        System.out.println(localDateTime1);


//        String sDate1="31/12/1998 ";
//        Date date1= null;
//        try {
//            date1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(sDate1);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(sDate1+"\t"+date1);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDateTime localDateTime1 = LocalDateTime.parse(stringLocalDateTime);
        System.out.println(localDateTime1);


        String formatDateTime = lt.format(dateTimeFormatter);

        System.out.println("After : " + formatDateTime);

    }
}
