package formatterwys.s2;

public enum FormatterStrategy {


    AMOUNT("amount", "desc") {



        @Override
        public String doFormat(String text) {
            return getString(text);
        }


    },

    DATE("date", "desc") {

        final SomeClass some =  new SomeClass();

        @Override
        public String doFormat(String text) {
            return some.makeString();
        }
    };


    FormatterStrategy(String date, String desc) {

    }

    public abstract String doFormat(String text);

    private static String getString(String text) {
        return STR."format amount ----> \{text}";
    }
}
