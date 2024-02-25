package datetime;

import java.time.LocalDateTime;

public class StringToLocalDateTime {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println("LocalDateTime : " + now);

//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


//        String str = "2016-03-04 11:30";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
//        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
//        System.out.println(dateTime);


//        String str = "03/11/2022";
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
//        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
//        System.out.println(dateTime);


//        LocalDateTime localDateTime = stringToLocalDateTime("03/11/2022", dateTimeFormatter);
//        System.out.println(localDateTime);

        String stringNow = now.toString();
        LocalDateTime localDateTime1 = LocalDateTime.parse(stringNow);
        System.out.println(localDateTime1);
    }


//    public static LocalDateTime stringToLocalDateTime(String dateString, DateTimeFormatter dateTimeFormatter) {
//
//
//        return LocalDateTime.parse(dateString, dateTimeFormatter);
//
//    }




}