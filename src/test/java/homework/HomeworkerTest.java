package homework;

//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;
//
//import java.util.List;
//import java.util.stream.Stream;
//
//import static homework.Homeworker.*;
//import static org.junit.jupiter.api.Assertions.assertEquals;


class HomeworkerTest {


//    parAMETRİZED  olmayan TEST
    /**
     * should validate the merged result against the expected result
     */
//    @Test
//    public void intersectionText() {
//        String input1 =
//                "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";
//
//        String input2 =
//                "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        String result =
//                "Kullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "karakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        List<String> wordList1 = wordListMaker(input1);
//        List<String> wordList2 = wordListMaker(input2);
//        List<String> resultList = wordListMaker(result);
//
//        StringBuilder resultString = listToString(resultList);
//        StringBuilder expectedString = merger(wordList1, wordList2);
//
////        assertEquals(resultString, expectedString);
//        assertEquals(resultString.toString(), expectedString.toString());
//    }
//
//    @Test
//    public void innerText() {
//        String input1 =
//                "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";
//
//        String input2 =
//                "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";
//
//        String result =
//                "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";
//
//        List<String> wordList1 = wordListMaker(input1);
//        List<String> wordList2 = wordListMaker(input2);
//        List<String> resultList = wordListMaker(result);
//
//        StringBuilder resultString = listToString(resultList);
//        StringBuilder expectedString = merger(wordList1, wordList2);
//
//        assertEquals(resultString.toString(), expectedString.toString());
//    }
//
//    @Test
//    public void differentText() {
//        String input1 =
//                "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";
//
//        String input2 =
//                "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        String result =
//                "Kullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "karakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        List<String> wordList1 = wordListMaker(input1);
//        List<String> wordList2 = wordListMaker(input2);
//        List<String> resultList = wordListMaker(result);
//
//        StringBuilder resultString = listToString(resultList);
//        StringBuilder expectedString = merger(wordList1, wordList2);
//
//        assertEquals(resultString.toString(), expectedString.toString());
//    }
//
//    @Test
//    public void fakeIntersectionText() {
//        String input1 =
//                "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";
//
//        String input2 =
//                "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada" +
//                        " X" +
//                        " girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        String result =
//                "Kullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "karakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n"
//
//                        + "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada" +
//                        " X" +
//                        " girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        List<String> wordList1 = wordListMaker(input1);
//        List<String> wordList2 = wordListMaker(input2);
//        List<String> resultList = wordListMaker(result);
//
//        StringBuilder resultString = listToString(resultList);
//        StringBuilder expectedString = merger(wordList1, wordList2);
//
//        assertEquals(resultString.toString(), expectedString.toString());
//    }
//
//    @Test
//    public void fakeAndRealIntersectionText() {
//        String input1 =
//                "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";
//
//        String input2 =
//                "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "girilen metinlerin"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        String result =
//                "Kullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "karakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "girilen metinlerin"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        List<String> wordList1 = wordListMaker(input1);
//        List<String> wordList2 = wordListMaker(input2);
//        List<String> resultList = wordListMaker(result);
//
//        StringBuilder resultString = listToString(resultList);
//        StringBuilder expectedString = merger(wordList1, wordList2);
//
//        assertEquals(resultString.toString(), expectedString.toString());
//    }


//    @ParameterizedTest
//    @MethodSource("generator")
//    void test(String originalStr, Integer expectedStr) {
//        assertThat(Counter.getResult(originalStr))
//                .isEqualTo(expectedStr);
//    }


//    parAMETRİZED   TEST
//    @ParameterizedTest
//    @MethodSource("generator")
//    void test(String input1, String input2, String result) {
//
//        List<String> wordList1 = wordListMaker(input1);
//        List<String> wordList2 = wordListMaker(input2);
//        List<String> resultList = wordListMaker(result);
//        StringBuilder resultString = listToString(resultList);
//
//       assertEquals(merger(wordList1, wordList2).toString(), resultString.toString());
//
////        assertThat(merger(wordList1, wordList2)).
////                isEqualTo(resultString);
//    }
//
//    static Stream<Arguments> generator() {
//        String input1 =
//                "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";
//
//        String input2 =
//                "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//
//        String input22 =
//                "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";
//
//
//        String input23 =
//                "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        String input24 =
//                "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada" +
//                        " X" +
//                        " girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        String input25 =
//                "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "girilen metinlerin"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        String input26 =
//                "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";
//
//        String input27 =
//                "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin kelime";
//
//        String result =
//                "Kullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "karakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//        String result2 =
//                "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";
//
//        String result4 =
//                "Kullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "karakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n"
//
//                        + "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada" +
//                        " X" +
//                        " girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        String result5 =
//                "Kullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "karakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "Burada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n"
//                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
//                        + "girilen metinlerin"
//                        + "algoritma kullanılarak gerçekleştirilecektir";
//
//        String result7 =
//                "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
//                        + "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
//                        + "\tBurada;\n"
//                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin kelime";
//
//
////        String input18 = "Girilen metinler hangi karakterden";
////        String input28 = "kelime Girilen metinler hangi karakterden";
////        String result8 = "Girilen metinler hangi karakterden kelime Girilen metinler hangi karakterden";
//        String input18 = "Girilen metinler hangi karakterden";
//        String input28 = "kelimeler Girilen metinler hangi karakterden";
//        String result8 = "Girilen metinler hangi karakterden kelimeler Girilen metinler hangi karakterden";
//
//        String input19 = "Girilen metinler hangi karakterden";
//        String input29 = "metinler kelimeler Girilen metinler hangi karakterden";
//        String result9 = "Girilen metinler hangi karakterden metinler kelimeler Girilen metinler hangi karakterden";
//
//        return Stream.of(
//                Arguments.of(input1, input2, result), // T1
//                Arguments.of(input1, input22, result2), // T2
//                Arguments.of(input1, input23, result), // T3
//                Arguments.of(input1, input24, result4), // T4
//                Arguments.of(input1, input25, result5),
//                Arguments.of(input1, input26, result2),
//                Arguments.of(input1, input27, result7),
//                Arguments.of(input18, input28, result8),
//                Arguments.of(input19, input29, result9));// T5

//        return Stream.of(
//                Arguments.of("dogs cats", 2), // T1
//                Arguments.of("dog cat", 0), // T2
//                Arguments.of("car bar", 2), // T3
//                Arguments.of("dogs, bar", 1), // T4
//                Arguments.of("1234", 0));// T5
    }
//}