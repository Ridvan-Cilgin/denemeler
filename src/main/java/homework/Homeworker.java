package homework;

import java.util.*;

public class Homeworker {
//    public static void main(String[] args) {
//        String input1 = "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n" +
//                "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n" +
//                "\tBurada;\n" +
//                "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";
//
//        String input2 = "Burada;\n" +
//                "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n" +
//                "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n" +
//                "algoritma kullanılarak gerçekleştirilecektir";
//
//        String result = "Kullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n" +
//                "karakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n" +
//                "Burada;\n" +
//                "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n" +
//                "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n" +
//                "algoritma kullanılarak gerçekleştirilecektir";
//
//
//        List<String> wordList1 = wordListMaker(input1);
//        List<String> wordList2 = wordListMaker(input2);
//        List<String> resultList = wordListMaker(result);
//
//
//        // validator(wordList1, resultList);
//
//        System.out.println("output-------------> " + merger(wordList1, wordList2));
//
//    }

    static StringBuilder merger(List<String> wordList1, List<String> wordList2) {
        List<String> intersection = getIntersection(wordList1, wordList2);

        List<String> diffWordList2 = new ArrayList<>(wordList2.subList(intersection.size(), wordList2.size()));
        System.out.println("diffWordList2 -----------> " + diffWordList2);
        Collections.reverse(intersection);
        System.out.println("intersection -----------> " + intersection);
        wordList1.addAll(diffWordList2);
        System.out.println("wordList1 -----------> " + wordList1);
        return listToString(wordList1);
    }

    static List<String> getIntersection(List<String> wordList1, List<String> wordList2) {
        int counter = 1;
        List<String> intersection = new ArrayList<>();
        String controlWord = getControlWord(wordList1, counter);
        String afterControlWord = getControlWord(wordList1, (counter + 1));

        for (int i = wordList2.size() - 1; i >= 1; i--) {
            if (wordList2.get(i).equals(controlWord)) {

                if ((wordList2.get(i - 1).equals(afterControlWord)) && i != 1) {
                    intersection.add(controlWord);
                    counter++;
                    controlWord = getControlWord(wordList1, counter);

                    if (wordList1.size() != counter) {
                        afterControlWord = getControlWord(wordList1, (counter + 1));
                    } else {
                        intersection.clear();
                        return intersection;
                    }


                } else if (i == 1) {
                    intersection.add(controlWord);
                    intersection.add(afterControlWord);
                } else {
                    intersection.clear();
                }
            }
        }
        return intersection;
    }

    private static String getControlWord(List<String> wordList, int counter) {
        return wordList.get(wordList.size() - counter);
    }

    static List<String> wordListMaker(String text) {
        String words1[] = text.trim().split("\\s+");
        return new ArrayList<>(Arrays.asList(words1));
    }

    static StringBuilder listToString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
            sb.append("\s");
        }
        return sb;
    }

    private static void validator(List<String> list1, List<String> resultList) {

        if (list1.size() != resultList.size()) System.out.println("size farklı");

        for (int i = 0; i < list1.size(); i++) {

            if (!list1.get(i).equals(resultList.get(i))) {
                System.out.println("elemanlar eş değil");
            }
        }

        System.out.println("All is well");
    }
}
