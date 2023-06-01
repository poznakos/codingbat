import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountXXTest {

    @Test
    void countXX_1() {
        CountXX systemUnderTest = new CountXX();
        assertEquals(1, systemUnderTest.countXX("abcxx"));
    }
    @Test
    void countXX_2() {
        CountXX systemUnderTest = new CountXX();
        assertEquals(2, systemUnderTest.countXX("xxx"));
    }
    @Test
    void countXX_3() {
        CountXX systemUnderTest = new CountXX();
        assertEquals(3, systemUnderTest.countXX("xxxx"));
    }
    @Test
    void countXX_4() {
        CountXX systemUnderTest = new CountXX();
        assertEquals(0, systemUnderTest.countXX("abc"));
    }
    @Test
    void countXX_5() {
        CountXX systemUnderTest = new CountXX();
        assertEquals(0, systemUnderTest.countXX("Hello there"));
    }
    @Test
    void countXX_6() {
        CountXX systemUnderTest = new CountXX();
        assertEquals(2, systemUnderTest.countXX("Hexxo thxxe"));
    }
    @Test
    void countXX_7() {
        CountXX systemUnderTest = new CountXX();
        assertEquals(0, systemUnderTest.countXX(""));
    }
    @Test
    void countXX_8() {
        CountXX systemUnderTest = new CountXX();
        assertEquals(0, systemUnderTest.countXX("Kittenes"));
    }
    @Test
    void countXX_9() {
        CountXX systemUnderTest = new CountXX();
        assertEquals(2, systemUnderTest.countXX("HKittensxxx"));
    }
}