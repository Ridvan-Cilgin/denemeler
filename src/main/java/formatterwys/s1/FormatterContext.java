package formatterwys.s1;

public class FormatterContext {
    private FormatterStrategy formatterStrategy;

    public FormatterContext(FormatterStrategy formatterStrategy) {
        this.formatterStrategy = formatterStrategy;
    }

    public FormatterContext() {

    }

    public void setFormatterStrategy(FormatterStrategy formatterStrategy) {
        this.formatterStrategy = formatterStrategy;
    }


    public String runFormatter(String context) {
        return formatterStrategy.doFormat(context);
    }
}
