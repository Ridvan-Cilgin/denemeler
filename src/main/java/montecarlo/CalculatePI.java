package montecarlo;

import java.util.Scanner;

public class CalculatePI {
    public static void main(String[] args) {
        CalculatePI calculatePI = new CalculatePI();
        calculatePI.calculator();
    }

    public double calculator() {
        System.out.print("Please give me a number : ");
        Scanner scan = new Scanner(System.in);
        double count = scan.nextDouble();
        double sayac = 0;

        for (int i = 0; i < count; i++) {
            double x = Math.random();
            double y = Math.random();

            double z = Math.sqrt((x * x) + (y * y));

            if (z <= 1) {
                sayac++;
            }
        }

        double myPI = (sayac / count) * 4;
        System.out.println("reel PI : " + Math.PI);
        System.out.println("Your PI : " + myPI);

        return myPI;
    }

}
