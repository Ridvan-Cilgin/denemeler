package abstractAndInheritance;

import lombok.Data;

@Data
public class Cat extends Animal {

    private String name;

    @Override
    public void breathe() {
        System.out.println(name + " is breathing");
    }

    @Override
    public void bark() {
        System.out.println("Meaw!");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}
