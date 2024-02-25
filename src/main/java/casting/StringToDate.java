package casting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StringToDate {
    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dateString = "14/07/2018";

        //string to date
        LocalDate localDate = LocalDate.parse(dateString, dateTimeFormatter);
        LocalDateTime localDateTime1 = localDate.atStartOfDay();
        System.out.println(localDateTime1);



//        String sDate1="31/12/1998 ";
//        Date date1= null;
//        try {
//            date1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(sDate1);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(sDate1+"\t"+date1);
    }
}
