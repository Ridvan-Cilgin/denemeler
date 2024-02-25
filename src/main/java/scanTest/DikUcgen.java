package scanTest;

import java.util.Scanner;

public class DikUcgen {

    public static void main(String[] args) {
        Scanner scale = new Scanner(System.in);
        System.out.print("Yükseklik : ");

        int length = scale.nextInt();

        int k = 0;

        for (int i = 0; i < length-1 ; i++) {

            System.out.println("  *");

            k++;
            for (int j = 0; j < k; j++) {
                System.out.print("  *");
            }

         //   System.out.print("*  ");
        }
        System.out.print("  *");
    }
}
