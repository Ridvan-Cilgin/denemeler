package sonarissues;

public class ReflectionTest {
    public static void main(String[] args) {
        Reflection reflection = new Reflection();
        reflection.setName("Orçun");
        reflection.setPageSize(350);

        System.out.println(reflection.extractNonBaseClassFieldValue("name"));

        System.out.println(reflection.extractNonBaseClassFieldValue("pageSize"));
    }
}
