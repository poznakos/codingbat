import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontTimesTest {

    @Test
    void frontTimes_1() {
        FrontTimes systemUnderTest = new FrontTimes();
        assertEquals("ChoCho", systemUnderTest.frontTimes("Chocolate", 2));
    }
    @Test
    void frontTimes_2() {
        FrontTimes systemUnderTest = new FrontTimes();
        assertEquals("ChoChoCho", systemUnderTest.frontTimes("Chocolate", 3));
    }
    @Test
    void frontTimes_3() {
        FrontTimes systemUnderTest = new FrontTimes();
        assertEquals("AbcAbcAbc", systemUnderTest.frontTimes("Abc", 3));
    }
    @Test
    void frontTimes_4() {
        FrontTimes systemUnderTest = new FrontTimes();
        assertEquals("", systemUnderTest.frontTimes("", 4));
    }
    @Test
    void frontTimes_5() {
        FrontTimes systemUnderTest = new FrontTimes();
        assertEquals("", systemUnderTest.frontTimes("Abc", 0));
    }
    @Test
    void frontTimes_6() {
        FrontTimes systemUnderTest = new FrontTimes();
        assertEquals("AbAbAbAb", systemUnderTest.frontTimes("Ab", 4));
    }
}