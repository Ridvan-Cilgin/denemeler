package datetime;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTimeToDate {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        Date date2 = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        System.out.println(date2);

        System.out.println(localDateTime);

        System.out.println(date2.getTime());

//        System.out.println(localDateTime.toInstant().toEpochMilli());

        System.out.println(localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());


        BigDecimal bigDecimal = BigDecimal.valueOf(100);

        System.out.println(bigDecimal.intValue());
    }
}
