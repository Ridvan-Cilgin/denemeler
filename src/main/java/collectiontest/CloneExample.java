package collectiontest;

import java.util.ArrayList;

public class CloneExample {
    public static void main(String[] args){

        // create an arraylist
        ArrayList<Integer> number = new ArrayList<>();

        number.add(1);
        number.add(3);
        number.add(5);
        System.out.println("ArrayList: " + number);

        // create copy of number
        ArrayList<Integer> cloneNumber = (ArrayList<Integer>)number.clone();
//        cloneNumber.stream().peek( n -> 5);
        System.out.println("Cloned ArrayList: " + cloneNumber);
    }
}
