package primenumber;

import java.util.ArrayList;
import java.util.List;

public class CountPrimeNumber {
    public static void main(String[] args) {
        CountPrimeNumber countPrimeNumbers = new CountPrimeNumber();
        System.out.println(countPrimeNumbers.countNumberOfPrimesUpTo(100));
        System.out.println(countPrimeNumbers.countNumberOfPrimesUpTo(1000).size());
    }

    public List<Integer> countNumberOfPrimesUpTo(Integer number) {

        List<Integer> primeNumberList = new ArrayList<>();

        for (int i = 2; i < number; i++) {
            primeNumberList.add(i);
        }

        for (int i = 2; i < number; i++) {
            for (int j = 2; j < number; j++) {
                if (j * i < number) {
                    int element = j * i;
                    primeNumberList.remove((Integer) element);

                }
            }
        }
        return primeNumberList;
    }
}


//[2,3,4,5,6,7,8,9,10.....n]