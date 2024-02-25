package abstractAndInheritance;

import lombok.Data;

@Data
public class Dog extends Animal {
    private String name;

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void breathe() {
        System.out.println("Dog is breathing");
    }

    @Override
    public void bark() {
        System.out.println("Woof!");
    }
}
