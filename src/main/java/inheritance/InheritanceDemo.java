package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
//        Animal cat = new Cat();
//
//        cat.setName("miyav");
//        cat.setAge(21);
//        cat.setCatNumber("23");
//        System.out.println(cat.getName());
//        System.out.println(cat);
//
//        Animal cat2 = new Cat("pisi", 43, "3");
//        System.out.println(cat2);
//
//        Animal cat3 = Cat.builder()
//                .catNumber("32")
//                .age(21)
//                .name("miyav")
//                .build();
//
//        System.out.println(cat3);
//        System.out.println(cat3.getName());
//
//        Animal animal = cat3;
//        System.out.println(animal);

        Animal animal2 = new Animal("animal", 12);

        Cat cat = (Cat)animal2;

        cat.setCatNumber("34");

        System.out.println(cat);
    }
}
