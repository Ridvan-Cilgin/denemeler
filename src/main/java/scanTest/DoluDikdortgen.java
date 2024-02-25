package scanTest;

import java.util.Scanner;

public class DoluDikdortgen {

    public static void main(String[] args) {

        Scanner scale = new Scanner(System.in);
        System.out.print("Genişlik : ");

        int weight = scale.nextInt();



        System.out.print("Yükseklik : ");

        int length = scale.nextInt();

        for (int j = 0; j < length; j++) {


            for (int i = 0; i < weight; i++) {
                System.out.print("*  ");

            }
            System.out.println();

        }


//
//        //System.out.print("*");
//        for (int j = 1; j < length-1; j++) {
//            System.out.print("*");
//            if ( j < length - 1) {
//                System.out.print("  ");
//                for (int i = 1; i <weight - 1; i++) {
//                    System.out.print("   ");
//                }
//                System.out.println("*");
//
//            } else {
//                System.out.print("*   ");
//                if (j == length - 1) {
//                    System.out.print("*");
//                }
//            }
//
//
//        }
//
//        for (int i = 0; i < weight; i++) {
//            System.out.print("*  ");
//
         }
}
