package switchCaseTest;

import java.util.Scanner;

public class NewSwitchCase {
    public static void main(String[] args) {

        NewSwitchCase newSwitchCase = new NewSwitchCase();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which day ???");

        System.out.println(newSwitchCase.dayOfWeek(scanner.nextInt()));

    }

    public String dayOfWeek(int dayNumber) {

        return switch (dayNumber) {

            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Wrong f.cking Number!!!";
        };
    }
}
