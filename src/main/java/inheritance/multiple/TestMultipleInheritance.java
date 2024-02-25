package inheritance.multiple;

public class TestMultipleInheritance {
    public static void main(String[] args) {
        Base base = new Base();
        base.setResponseHeader("header");
        base.setResponseBody("body");
        System.out.println(base);

//        General general = new General();
//        general.setAmount("100");
//        general.setOrder("order");
//        general.setResponseHeader("header");
//        general.setResponseBody("body");
//        System.out.println(general);
//        System.out.println(general.getResponseBody());

        Migros migros = new Migros();
        migros.setHistory("history");
        System.out.println(migros);
        migros.setResponseHeader("migrosHeader");
        System.out.println(migros.getResponseHeader());
        System.out.println(migros.getOrder());





        //todo : we have general and we need migros objects.
        // we want to create a new object which is a combination of general and migros

//        Migros migros2 = new Migros(general.getResponseHeader(),
//                general.getResponseBody(), general.getAmount(), general.getOrder(), migros.getHistory());

//
//        General base2 = migros2;
//        System.out.println("base2---> "+base2);
//
//        System.out.println(base2.getResponseBody());
//        System.out.println(migros2.getAmount());
//
        //---------------------------

        General general = new General();
        general.setAmount("100");
        general.setOrder("order");
        general.setResponseHeader("header");
        general.setResponseBody("body");

        Migros migros2 = new Migros(general, "12");

        System.out.println(migros2);

    }
}
