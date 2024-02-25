package primenumber;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
     //   primeNumbers.isPrime();

        System.out.println("count : " +primeNumbers.countNumberOfPrimesUpTo());
    }

    public Boolean isPrime(int n) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" sayı : ");
//        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Lüfen pozitif sayı girin");
        }else{
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println(n + " saysı asal sayı değil " + i + " ye bölünüyor");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println(n + " saysı asaldır");
            }
            return isPrime;
        }
       return false;
    }


    public Integer countNumberOfPrimesUpTo(){

        System.out.println("sayı : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 2; i <n ; i++) {

            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
}
