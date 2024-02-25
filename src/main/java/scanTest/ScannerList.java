package scanTest;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerList {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
//
        ArrayList<String> list = new ArrayList<>();
        while (input.hasNextLine()) {
            list.add(input.next());

            if (input.next().equals("end")) {
                break;
            }
        }

        System.out.println(list);
        input.close();

//        Scanner scanner = new Scanner(System.in);
////        StringTokenizer st = new StringTokenizer(scanner.nextLine(), " ");
//        while (scanner.hasMoreElements()) {
//            list.add(scanner.nextElement().toString());
//        }
//        scanner.close();
//        System.out.println(list);
    }
}
