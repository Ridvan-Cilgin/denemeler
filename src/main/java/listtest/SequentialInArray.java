package listtest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SequentialInArray {
    public static void main(String[] args) {


        List<ArrayList<Integer>> a = new ArrayList<>();
        List<Integer> seqList = new ArrayList<>();

        List<Integer> seqNomineeList = new ArrayList<>();
        List<Integer> numberlist = new ArrayList<>(List.of(2, 1, 3, 5, 6, 7, 8, 11, 12, 13, 9, 10));

        List<Integer> sortedList = numberlist.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list ---------> ");
        sortedList.forEach(System.out::print);

        int count = 1;
        for (int j = 1; j < sortedList.size(); j++) {

            if (sortedList.get(j) == sortedList.get(j - 1) + 1) {
                count++;
                seqNomineeList.add(sortedList.get(j - 1));

                if (count > 2 && (j == sortedList.size() - 1 || (sortedList.get(j) + 1 != sortedList.get(j + 1)))) {

                    seqNomineeList.add(sortedList.get(j));
                    a.add(new ArrayList(seqNomineeList));
                    seqList.addAll(seqNomineeList);

                }
            } else {
                count = 1;
                seqNomineeList.clear();
            }
        }

        for (int i = 0; i < a.size(); i++) {
            List<Integer> x = new ArrayList<>();

            x = a.get(i);

            System.out.println(x);
        }

        System.out.println("a ---------> ");
        System.out.println(a);

        System.out.println("seq---------> ");
        System.out.println(seqList);
    }
}

