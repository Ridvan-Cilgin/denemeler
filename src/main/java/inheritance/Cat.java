package inheritance;

import lombok.*;

@Setter
@Getter
@ToString
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
public class Cat extends Animal{
    protected String catNumber;


//    public Cat() {
//        super();
//        this.catNumber = catNumber;
//    }
    @Builder
    public Cat(String name, int age, String catNumber) {
        super(name, age);
        this.catNumber = catNumber;
    }



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