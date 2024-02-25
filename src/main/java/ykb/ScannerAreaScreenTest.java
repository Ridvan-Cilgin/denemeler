package ykb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerAreaScreenTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> areaMap = new ArrayList<>();
        List<String> areaList = new ArrayList<>();
        areaMap.addAll(listener(areaList, input));


        List<String> screenList = new ArrayList<>();
        areaMap.addAll(listener(screenList, input));


        System.out.println(areaMap);
        input.close();
    }

    private static List<String> listener(List<String> lines, Scanner input) {


        while (input.hasNext()) {
            String line = input.nextLine();
            lines.add(line);

            if (line.equals("exit")) {
                lines.remove(lines.get(lines.size() - 1));
                break;
            }
        }

        return lines;

    }


}
