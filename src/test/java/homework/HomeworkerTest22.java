package homework;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HomeworkerTest22 {
    /**
     * Method under test: {@link Homeworker#merger(List, List)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMerger() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at homework.Homeworker.getControlWord(Homeworker.java:75)
        //       at homework.Homeworker.getIntersection(Homeworker.java:50)
        //       at homework.Homeworker.merger(Homeworker.java:39)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> wordList1 = new ArrayList<>();
        Homeworker.merger(wordList1, new ArrayList<>());
    }

    /**
     * Method under test: {@link Homeworker#merger(List, List)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMerger2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at homework.Homeworker.getControlWord(Homeworker.java:75)
        //       at homework.Homeworker.getIntersection(Homeworker.java:51)
        //       at homework.Homeworker.merger(Homeworker.java:39)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");
        Homeworker.merger(stringList, new ArrayList<>());
    }

    /**
     * Method under test: {@link Homeworker#merger(List, List)}
     */
    @Test
    public void testMerger3() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add(1, "Element");
        Homeworker.merger(stringList, new ArrayList<>());
        assertEquals(2, stringList.size());
        assertEquals("42", stringList.get(0));
        assertEquals("Element", stringList.get(1));
    }

    /**
     * Method under test: {@link Homeworker#merger(List, List)}
     */
    @Test
    public void testMerger4() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add(1, "Element");

        ArrayList<String> stringList1 = new ArrayList<>();
        stringList1.add("");
        stringList1.add("foo");
        Homeworker.merger(stringList, stringList1);
        assertEquals(4, stringList.size());
        assertEquals("42", stringList.get(0));
        assertEquals("Element", stringList.get(1));
        assertEquals("", stringList.get(2));
        assertEquals("foo", stringList.get(3));
    }

    /**
     * Method under test: {@link Homeworker#merger(List, List)}
     */
    @Test
    public void testMerger5() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add(1, "foo");

        ArrayList<String> stringList1 = new ArrayList<>();
        stringList1.add("");
        stringList1.add("foo");
        Homeworker.merger(stringList, stringList1);
        assertEquals(4, stringList.size());
        assertEquals("42", stringList.get(0));
        assertEquals("foo", stringList.get(1));
        assertEquals("", stringList.get(2));
        assertEquals("foo", stringList.get(3));
    }

    /**
     * Method under test: {@link Homeworker#merger(List, List)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testMerger6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 2
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at homework.Homeworker.getControlWord(Homeworker.java:75)
        //       at homework.Homeworker.getIntersection(Homeworker.java:60)
        //       at homework.Homeworker.merger(Homeworker.java:39)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("");
        stringList.add(1, "foo");

        ArrayList<String> stringList1 = new ArrayList<>();
        stringList1.add("");
        stringList1.add("foo");
        Homeworker.merger(stringList, stringList1);
    }

    /**
     * Method under test: {@link Homeworker#getIntersection(List, List)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetIntersection() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at homework.Homeworker.getControlWord(Homeworker.java:75)
        //       at homework.Homeworker.getIntersection(Homeworker.java:50)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> wordList1 = new ArrayList<>();
        Homeworker.getIntersection(wordList1, new ArrayList<>());
    }

    /**
     * Method under test: {@link Homeworker#getIntersection(List, List)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetIntersection2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 1
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at homework.Homeworker.getControlWord(Homeworker.java:75)
        //       at homework.Homeworker.getIntersection(Homeworker.java:51)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("foo");
        Homeworker.getIntersection(stringList, new ArrayList<>());
    }

    /**
     * Method under test: {@link Homeworker#getIntersection(List, List)}
     */
    @Test
    public void testGetIntersection3() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("foo");
        assertTrue(Homeworker.getIntersection(stringList, new ArrayList<>()).isEmpty());
    }

    /**
     * Method under test: {@link Homeworker#getIntersection(List, List)}
     */
    @Test
    public void testGetIntersection4() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("foo");

        ArrayList<String> stringList1 = new ArrayList<>();
        stringList1.add("");
        stringList1.add("");
        assertTrue(Homeworker.getIntersection(stringList, stringList1).isEmpty());
    }

    /**
     * Method under test: {@link Homeworker#getIntersection(List, List)}
     */
    @Test
    public void testGetIntersection5() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("42");
        stringList.add("");

        ArrayList<String> stringList1 = new ArrayList<>();
        stringList1.add("");
        stringList1.add("");
        assertTrue(Homeworker.getIntersection(stringList, stringList1).isEmpty());
    }

    /**
     * Method under test: {@link Homeworker#getIntersection(List, List)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetIntersection6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 2
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at homework.Homeworker.getControlWord(Homeworker.java:75)
        //       at homework.Homeworker.getIntersection(Homeworker.java:60)
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("");
        stringList.add("");

        ArrayList<String> stringList1 = new ArrayList<>();
        stringList1.add("");
        stringList1.add("");
        Homeworker.getIntersection(stringList, stringList1);
    }

    /**
     * Method under test: {@link Homeworker#getIntersection(List, List)}
     */
    @Test
    public void testGetIntersection7() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("");
        stringList.add("");
        stringList.add("");

        ArrayList<String> stringList1 = new ArrayList<>();
        stringList1.add("");
        stringList1.add("");
        List<String> actualIntersection = Homeworker.getIntersection(stringList, stringList1);
        assertEquals(2, actualIntersection.size());
        assertEquals("", actualIntersection.get(0));
        assertEquals("", actualIntersection.get(1));
    }

    /**
     * Method under test: {@link Homeworker#getIntersection(List, List)}
     */
    @Test
    public void testGetIntersection8() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("");
        stringList.add("");
        stringList.add("");

        ArrayList<String> stringList1 = new ArrayList<>();
        stringList1.add("foo");
        stringList1.add("");
        stringList1.add("");
        assertTrue(Homeworker.getIntersection(stringList, stringList1).isEmpty());
    }

    /**
     * Method under test: {@link Homeworker#wordListMaker(String)}
     */
    @Test
    public void testWordListMaker() {
        List<String> actualWordListMakerResult = Homeworker.wordListMaker("Text");
        assertEquals(1, actualWordListMakerResult.size());
        assertEquals("Text", actualWordListMakerResult.get(0));
    }
}

