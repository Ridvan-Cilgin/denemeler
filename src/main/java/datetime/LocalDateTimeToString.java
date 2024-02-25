package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeToString {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println("Before : " + now);

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//
//        String formatDateTime = now.format(formatter);
//
//        System.out.println("After : " + formatDateTime);


//
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//        String stringDateTime = now.format(dateTimeFormatter);
//
//        System.out.println("After : " + stringDateTime);


        String stringNow = now.toString();
        LocalDateTime localDateTime1 = LocalDateTime.parse(stringNow);
        System.out.println(localDateTime1);


        String stringDateTime2 = localDateTime1.format(dateTimeFormatter);

        System.out.println("After 2: " + stringDateTime2);

        System.out.println("---------------------------");

        System.out.println(stringToLocalDateTime("2022-10-18T12:05:53.579355900", dateTimeFormatter));

        System.out.println(formatter("2022-10-18T12:05:53.579355900", dateTimeFormatter));

    }

    public static String stringToLocalDateTime(String dateString, DateTimeFormatter dateTimeFormatter) {
        LocalDateTime localDateTime1 = LocalDateTime.parse(dateString);
        return localDateTime1.format(dateTimeFormatter);
    }


    public static String formatter(String strDate, DateTimeFormatter dateTimeFormatter) {
        if (strDate == null) return null;

        LocalDateTime localDateTime;
        try {
            localDateTime = LocalDateTime.parse(strDate);
        } catch (Exception e) {
            return null;
        }
        return localDateTime.format(dateTimeFormatter);
    }

}
