package casting;

import java.math.BigDecimal;

public class IntegerToBigDecimal {
    public static void main(String[] args) {
        Integer i = 10;
        BigDecimal bd = new BigDecimal(i);
        System.out.println(bd);
        System.out.println(bd.getClass());

        System.out.println(new BigDecimal(i));
        System.out.println(BigDecimal.valueOf(i));
    }
}
