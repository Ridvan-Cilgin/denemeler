package inheritance.inheritance2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Setter
@Getter
@ToString
//@Builder
//@AllArgsConstructor
@NoArgsConstructor
public class Cat extends Animal {
    protected String catNumber;

    public Cat(String name, int age) {
        super(name, age);
    }

//    public Cat() {
//        super();
//    }


//    public Cat() {
//        super();
//        this.catNumber = catNumber;
//    }
//    @Builder
//    public Cat(String name, int age, String catNumber) {
//        super(name, age);
//        this.catNumber = catNumber;
//    }

//
//    @Override
//    public void setName(String name) {
//        super.setName(name);
//    }
//
//    @Override
//    public void setAge(int age) {
//        super.setAge(age);
//    }


}