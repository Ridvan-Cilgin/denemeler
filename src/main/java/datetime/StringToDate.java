package datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        String dateInString = "2022-10-18T12:05:53";

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = formatter.parse(dateInString);
        System.out.println(date);
        System.out.println(formatter.format(date));

    }
}
