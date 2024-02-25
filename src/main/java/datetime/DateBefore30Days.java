package datetime;

import java.time.LocalDateTime;

public class DateBefore30Days {
    public static void main(String[] args) {
        LocalDateTime now =  LocalDateTime.now();

        System.out.println(now);


        System.out.println(now.minusDays(30));
        System.out.println(now.minusDays(7));
    }
}
