package abstractAndInheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.setName("Tom");

        Animal dog = new Dog();
        dog.setName("Jerry");

        cat = dog;
        System.out.println(cat.getName());
    }
}
