import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleXTest {

    @Test
    void doubleX_1() {
        DoubleX systemUnderTest = new DoubleX();
        assertEquals(true, systemUnderTest.doubleX("axxbb"));
    }
    @Test
    void doubleX_2() {
        DoubleX systemUnderTest = new DoubleX();
        assertEquals(false, systemUnderTest.doubleX("axaxax"));
    }
    @Test
    void doubleX_3() {
        DoubleX systemUnderTest = new DoubleX();
        assertEquals(true, systemUnderTest.doubleX("xxxxx"));
    }
    @Test
    void doubleX_4() {
        DoubleX systemUnderTest = new DoubleX();
        assertEquals(false, systemUnderTest.doubleX("xaxxx"));
    }
    @Test
    void doubleX_5() {
        DoubleX systemUnderTest = new DoubleX();
        assertEquals(false, systemUnderTest.doubleX("aaaax"));
    }
    @Test
    void doubleX_6() {
        DoubleX systemUnderTest = new DoubleX();
        assertEquals(false, systemUnderTest.doubleX(""));
    }
    @Test
    void doubleX_7() {
        DoubleX systemUnderTest = new DoubleX();
        assertEquals(false, systemUnderTest.doubleX("abc"));
    }
    @Test
    void doubleX_8() {
        DoubleX systemUnderTest = new DoubleX();
        assertEquals(false, systemUnderTest.doubleX("x"));
    }
    @Test
    void doubleX_9() {
        DoubleX systemUnderTest = new DoubleX();
        assertEquals(true, systemUnderTest.doubleX("xx"));
    }
    @Test
    void doubleX_10() {
        DoubleX systemUnderTest = new DoubleX();
        assertEquals(false, systemUnderTest.doubleX("xax"));
    }
    @Test
    void doubleX_11() {
        DoubleX systemUnderTest = new DoubleX();
        assertEquals(false, systemUnderTest.doubleX("xaxx"));
    }
}