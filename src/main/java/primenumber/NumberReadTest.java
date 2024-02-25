package primenumber;

import java.util.*;

public class NumberReadTest {
    public static void main(String[] args) {

        int inputNumber = getNumberFromConsole();

        List<String> holeNumberPronounce = numberPronounceFormatter(inputNumber);
        System.out.println(holeNumberPronounce);

    }

    private static List<String> numberPronounceFormatter(int inputNumber) {

        Map<Integer, String> numberPronouncePool = createNumberPronouncePool();

        int toplamHaneSayisi = getInputNumberLayer(inputNumber);

        List<String> reversePronounceHoleNUmber = new ArrayList<>();

        if (numberPronouncePool.containsKey(inputNumber)) {
            reversePronounceHoleNUmber.add(numberPronouncePool.get(inputNumber));
            return reversePronounceHoleNUmber;
        }

        int haneKonumu = 1;

        while (toplamHaneSayisi > 0) {
            int hane = inputNumber % 10;

            if (haneKonumu == 2) hane *= 10;

            String haneOkunusu = numberPronouncePool.get(hane);
            if (haneKonumu == 3) haneOkunusu += "yüz";
            if (haneKonumu == 4) haneOkunusu += "bin";
            reversePronounceHoleNUmber.add(haneOkunusu);

            inputNumber /= 10;
            toplamHaneSayisi--;
            haneKonumu++;

        }

        Collections.reverse(reversePronounceHoleNUmber);
        return reversePronounceHoleNUmber;

    }

    private static int getInputNumberLayer(int inputNumber) {
        int haneSayisi = 1;
        while (inputNumber / 10 > 0) {
            haneSayisi++;
            inputNumber /= 10;
        }
        return haneSayisi;
    }

    private static Map<Integer, String> createNumberPronouncePool() {
        HashMap<Integer, String> numbersMap = new HashMap<>();

        numbersMap.put(0, "sıfır");
        numbersMap.put(1, "bir");
        numbersMap.put(2, "iki");
        numbersMap.put(3, "üç");
        numbersMap.put(4, "dört");
        numbersMap.put(5, "beş");
        numbersMap.put(6, "altı");
        numbersMap.put(7, "yedi");
        numbersMap.put(8, "sekiz");
        numbersMap.put(9, "dokuz");
        numbersMap.put(10, "on");
        numbersMap.put(20, "yirmi");
        numbersMap.put(40, "kırk");
        numbersMap.put(30, "otuz");
        numbersMap.put(50, "elli");
        numbersMap.put(60, "altmış");
        numbersMap.put(70, "yetmiş");
        numbersMap.put(80, "seksen");
        numbersMap.put(90, "doksan");
        numbersMap.put(100, "yüz");
        numbersMap.put(1000, "bin");

        return numbersMap;

    }

    private static int getNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin: ");
        return scanner.nextInt();
    }
}
