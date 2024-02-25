package abstractAndInheritance;

import lombok.Data;

@Data
public abstract class Animal {

    private String name;

    public abstract void breathe();

    public abstract void bark();

    public abstract void eat();

    public abstract void sleep();
}
