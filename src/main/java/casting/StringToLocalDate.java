package casting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate {

    public static void main(String[] args) {

        System.out.println(convertLocalDateTimeFromString("17.08.2021 18:20:16"));
    }

    public static LocalDateTime convertLocalDateTimeFromString(String time) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        return LocalDateTime.parse(time, dateTimeFormatter);
    }
}
