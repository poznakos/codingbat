import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Last2Test {

    @Test
    void last2_1() {
        Last2 systemUnderTest = new Last2();
        assertEquals(1, systemUnderTest.last2("hixxhi"));
    }
    @Test
    void last2_2() {
        Last2 systemUnderTest = new Last2();
        assertEquals(1, systemUnderTest.last2("xaxxaxaxx"));
    }
    @Test
    void last2_3() {
        Last2 systemUnderTest = new Last2();
        assertEquals(2, systemUnderTest.last2("axxxaaxx"));
    }
    @Test
    void last2_4() {
        Last2 systemUnderTest = new Last2();
        assertEquals(3, systemUnderTest.last2("xxaxxaxxaxx"));
    }
    @Test
    void last2_5() {
        Last2 systemUnderTest = new Last2();
        assertEquals(0, systemUnderTest.last2("xaxaxaxx"));
    }
    @Test
    void last2_6() {
        Last2 systemUnderTest = new Last2();
        assertEquals(2, systemUnderTest.last2("xxxx"));
    }
    @Test
    void last2_7() {
        Last2 systemUnderTest = new Last2();
        assertEquals(1, systemUnderTest.last2("13121312"));
    }
    @Test
    void last2_8() {
        Last2 systemUnderTest = new Last2();
        assertEquals(1, systemUnderTest.last2("11212"));
    }
    @Test
    void last2_9() {
        Last2 systemUnderTest = new Last2();
        assertEquals(0, systemUnderTest.last2("13121311"));
    }
    @Test
    void last2_10() {
        Last2 systemUnderTest = new Last2();
        assertEquals(2, systemUnderTest.last2("1717171"));
    }
    @Test
    void last2_11() {
        Last2 systemUnderTest = new Last2();
        assertEquals(0, systemUnderTest.last2("hi"));
    }
    @Test
    void last2_12() {
        Last2 systemUnderTest = new Last2();
        assertEquals(0, systemUnderTest.last2("h"));
    }
    @Test
    void last2_13() {
        Last2 systemUnderTest = new Last2();
        assertEquals(0, systemUnderTest.last2(""));
    }
}