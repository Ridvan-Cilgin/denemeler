package formatterwys.s1;

public enum FormatterStrategy {


    AMOUNT("amount", "desc") {

        String attribute;

        public void setAttribute(String attribute) {
            this.attribute = attribute;
        }

        @Override
        public String doFormat(String text) {
            return STR."format amount ----> \{text}\{attribute}";
        }
    },

    DATE("date", "desc") {
                String attributeDate;
        @Override
        public String doFormat(String text) {
            return STR."format date ----> \{text}\{attributeDate}";
        }
    };


    FormatterStrategy(String date, String desc) {

    }

    public abstract String doFormat(String text);
}
