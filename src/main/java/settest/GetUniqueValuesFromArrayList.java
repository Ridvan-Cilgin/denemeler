package settest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GetUniqueValuesFromArrayList {
    public static void main(String[] args) {



        // Create ArrayList
        ArrayList<String> ArrList = new ArrayList<String>();

        // add values in ArrayList
        ArrList.add("a");
        ArrList.add("b");
        ArrList.add("c");
        ArrList.add("b");
        ArrList.add("d");
        ArrList.add("a");
        ArrList.add("c");

        // display original ArrayList
        System.out.println("Original ArrayList is : "
                + ArrList);

        // convert ArrayList to HastSet.
        HashSet<String> hset = new HashSet<>(ArrList);

        List<String> list = new ArrayList<>(hset);


        System.out.println("ArrayList Unique Values is : "
                + list);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        for (String s : list) {
            System.out.println(s);
        }

    }
}
