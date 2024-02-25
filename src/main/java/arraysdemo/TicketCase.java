package arraysdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class TicketCase {
    public static void main(String[] args) {


        List<List<Integer>> graph = new ArrayList<>();

        List<Integer> maxCountList = new ArrayList<>();

        List<Integer> ticket = new java.util.ArrayList<>(List.of(12, 2, 3, 5, 13, 11, 11, 11, 4, 8));
        System.out.println("Original array: " + ticket);

        Collections.sort(ticket);
        System.out.println("Sorted array: " + ticket);
        List<Integer> unRegularList = new ArrayList<>(ticket);


        while (unRegularList.size() > 0) {
            List<Integer> regularList = regulator(unRegularList);
            graph.add(regularList);
            unRegularList.removeAll(regularList);

            if (regularList.size() > maxCountList.size()) {
                maxCountList = regularList;
            }
        }

        System.out.println("graph : " + graph);
        System.out.println("maxCountList : " + maxCountList);
        System.out.println("maxCountList size: " + maxCountList.size());

    }

    private static List<Integer> regulator(List<Integer> unRegularList) {
        ArrayList<Integer> firstRegularArray = new ArrayList<>();
        firstRegularArray.add(unRegularList.get(0));
        for (int i = 1; i < unRegularList.size(); i++) {

            if (Objects.equals(unRegularList.get(i - 1), unRegularList.get(i)) || unRegularList.get(i - 1) + 1 == unRegularList.get(i)) {
                firstRegularArray.add(unRegularList.get(i));

            } else {
                break;
            }
        }

        System.out.println("firstRegularArray : " + firstRegularArray);
        return firstRegularArray;
    }
}
