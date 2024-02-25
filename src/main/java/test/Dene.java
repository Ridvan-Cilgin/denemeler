package test;

import java.util.Scanner;

public class Dene {
    public static void main(String[] args) {

        System.out.println("Nokta sayısı girin : ");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numberInCircle = 0;

        long start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();

            double distance = x * x + y * y;
            if (distance <= 1) {
                numberInCircle++;
            }

            double myPI = 4.0 * numberInCircle / n;

            System.out.println("My pi : " + myPI);
            System.out.println("Java's PI : " + Math.PI);

            long end = System.currentTimeMillis();

            var time = end - start;
            System.out.println("Time : " + time + "msc");
        }
    }
}
