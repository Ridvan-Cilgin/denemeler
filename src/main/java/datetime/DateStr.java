package datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateStr {
    public static void main(String[] args) {

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy hh:mm:ss a", Locale.US);
//
//        String date = "Tuesday, Aug 16, 2016 12:10:56 PM";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);
        String date = "03/11/2022";
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);


//        System.out.println(formatter.format(localDate));



        String dateInString = "2016-08-16T15:23:01Z";

        Instant instant = Instant.parse(dateInString);

        LocalDateTime result = LocalDateTime.ofInstant(instant, ZoneId.of(ZoneOffset.UTC.getId()));

        System.out.println("LocalDateTime : " + result);

    }
}
//    String str = "03/11/2022";
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);