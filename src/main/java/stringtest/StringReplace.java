package stringtest;

import java.text.ParseException;

public class StringReplace {
    public static void main(String[] args) throws ParseException {
        String startDate = "2022-12-05";

        String req = "20221205";

//        System.out.println(replacer(startDate));

        System.out.println(replacerTi(req));
    }

    static String replacer(String date) {
        return date.replace("-", "");
    }

    static String replacerTi(String date) {
        return date.substring(0, 4) + "-" + date.substring(4, 6) + "-" + date.substring(6, 8);
    }


}
