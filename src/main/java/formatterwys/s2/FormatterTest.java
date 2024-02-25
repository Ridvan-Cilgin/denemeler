package formatterwys.s2;

public class FormatterTest {
    public static void main(String[] args) {


//        FormatterContext formatterContext = new FormatterContext(FormatterStrategy.AMOUNT);
//        System.out.println(formatterContext.runFormatter("Some Amount Value"));
//
//
//        FormatterContext formatterContext2 = new FormatterContext(FormatterStrategy.DATE);
//        System.out.println(formatterContext2.runFormatter("Some Date Value"));



//        FormatterContext formatterContext = new FormatterContext();
//        formatterContext.setFormatterStrategy(FormatterStrategy.AMOUNT);
//        System.out.println(formatterContext.runFormatter("Some Amount Value"));
//
//        formatterContext.setFormatterStrategy(FormatterStrategy.DATE);
//        System.out.println(formatterContext.runFormatter("Some Date Value"));




        FormatterContext formatterContext = new FormatterContext(FormatterStrategy.AMOUNT);
        System.out.println(formatterContext.runFormatter("Some Amount Value"));


        FormatterContext formatterContext2 = new FormatterContext(FormatterStrategy.DATE);
        System.out.println(formatterContext2.runFormatter("Some Date Value"));

    }
}
//confirm
//amount : 300TL
//
//300.00 TL
//
//
////execute
//
//amount : 300
//curreny : TL
