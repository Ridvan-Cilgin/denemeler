package inheritance.inheritance2;

public class InheritanceDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "";
        cat.age = 12;
        cat.catNumber = "q34";
//        cat.setName("miyav");
//        cat.setAge(21);
//        cat.setCatNumber("23");
//        System.out.println(cat.getName());
//        System.out.println(cat);

//        Animal cat2 = new Cat("pisi", 43, "3");
        System.out.println(cat);

//        Animal cat3 = Cat.builder()
//                .catNumber("32")
//                .age(21)
//                .name("miyav")
//                .build();

//        System.out.println(cat3);
//        System.out.println(cat3.getName());
//
//        Animal animal = cat3;
//        System.out.println(animal);

    }
}
