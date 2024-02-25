package test;

import java.util.Scanner;

public class SouttTest {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        System.out.println("yaşım : " + 13);
//
//        int a = 15;
//        System.out.println("Select your card index[0-" + a + "]");
//

        SouttTest s1 = new SouttTest();

        System.out.println(s1.x());
        System.out.println("--------------");
        System.out.println(s1.y());


    }


    public int x() {
        System.out.println("Select your card index[0-" + 3 + "]");
//        unPerList.forEach(System.out::print);
        int input = scanner.nextInt();

        return input;
    }

    public int y() {
        System.out.println("Select your card index[0-" + 4 + "]");
//        unPerList.forEach(System.out::print);
        int input = scanner.nextInt();

        return input;
    }

}
