package homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HomeworkerTest11 {

    /**
     * should handle empty word lists as input
     */
    @Test
    public void mergerHandlesEmptyWordLists() {
        List<String> wordList1 = new ArrayList<>();
        List<String> wordList2 = new ArrayList<>();
        List<String> expectedList = new ArrayList<>();

        List<String> actualList = Homeworker.getIntersection(wordList1, wordList2);

        assertEquals(expectedList, actualList);
    }

    /**
     * should handle single-word lists as input
     */
    @Test
    public void mergerHandlesSingleWordLists() {
        List<String> wordList1 = new ArrayList<>();
        wordList1.add("a");
        wordList1.add("b");
        wordList1.add("c");

        List<String> wordList2 = new ArrayList<>();
        wordList2.add("a");
        wordList2.add("b");
        wordList2.add("c");

        List<String> expectedList = new ArrayList<>();
        expectedList.add("a");
        expectedList.add("b");
        expectedList.add("c");

        List<String> resultList = Homeworker.getIntersection(wordList1, wordList2);

        assertEquals(expectedList, resultList);
    }

    /**
     * should return an empty list when there is no intersection
     */
    @Test
    public void mergerReturnsEmptyListWhenNoIntersection() {
        List<String> wordList1 = mock(List.class);
        List<String> wordList2 = mock(List.class);

        when(wordList1.size()).thenReturn(3);
        when(wordList2.size()).thenReturn(3);

        when(wordList1.get(0)).thenReturn("a");
        when(wordList1.get(1)).thenReturn("b");
        when(wordList1.get(2)).thenReturn("c");

        when(wordList2.get(0)).thenReturn("d");
        when(wordList2.get(1)).thenReturn("e");
        when(wordList2.get(2)).thenReturn("f");

        List<String> intersection = Homeworker.getIntersection(wordList1, wordList2);

        assertEquals(0, intersection.size());
    }

    /**
     * should return the correct intersection of two word lists
     */
    @Test
    public void mergerReturnsCorrectIntersection() {
        String input1 =
                "\tKullanıcı tarafından kaydedilen dökümanlar “birleştir” butonuna tıklandığında kalan \n"
                        + "\tkarakterlerin göreli sırasını değiştirmeden karakter tabanlı olarak birleştirilmelidir. \n"
                        + "\tBurada;\n"
                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin";

        String input2 =
                "Burada;\n"
                        + "Girilen metinler hangi karakterden itibaren birleştirilebileceğine yada girilen metinlerin \n"
                        + "birleştirilip birleştirilmeyeceğine karar verme işlemi sizin tarafınızdan geliştirilen bir \n"
                        + "algoritma kullanılarak gerçekleştirilecektir";

        List<String> wordList1 = Homeworker.wordListMaker(input1);
        List<String> wordList2 = Homeworker.wordListMaker(input2);

        List<String> intersection = Homeworker.getIntersection(wordList1, wordList2);

        assertEquals(intersection.size(), 3);
        assertEquals(intersection.get(0), "karakterlerin");
        assertEquals(intersection.get(1), "göreli");
        assertEquals(intersection.get(2), "sırasını");
    }
}