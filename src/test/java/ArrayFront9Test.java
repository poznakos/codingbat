import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFront9Test {

    @Test
    void arrayFront9_1() {
        ArrayFront9 systemUnderTest = new ArrayFront9();
        assertEquals(true, systemUnderTest.arrayFront9(new int[]{1, 2, 9, 3, 4}));
    }
    @Test
    void arrayFront9_2() {
        ArrayFront9 systemUnderTest = new ArrayFront9();
        assertEquals(false, systemUnderTest.arrayFront9(new int[]{1, 2, 3, 4, 9}));
    }
    @Test
    void arrayFront9_3() {
        ArrayFront9 systemUnderTest = new ArrayFront9();
        assertEquals(false, systemUnderTest.arrayFront9(new int[]{1, 2, 3, 4, 5}));
    }
    @Test
    void arrayFront9_4() {
        ArrayFront9 systemUnderTest = new ArrayFront9();
        assertEquals(true, systemUnderTest.arrayFront9(new int[]{9, 2, 3}));
    }
    @Test
    void arrayFront9_5() {
        ArrayFront9 systemUnderTest = new ArrayFront9();
        assertEquals(true, systemUnderTest.arrayFront9(new int[]{1, 9, 9}));
    }
    @Test
    void arrayFront9_6() {
        ArrayFront9 systemUnderTest = new ArrayFront9();
        assertEquals(false, systemUnderTest.arrayFront9(new int[]{1, 2, 3}));
    }
    @Test
    void arrayFront9_7() {
        ArrayFront9 systemUnderTest = new ArrayFront9();
        assertEquals(true, systemUnderTest.arrayFront9(new int[]{1, 9}));
    }
    @Test
    void arrayFront9_8() {
        ArrayFront9 systemUnderTest = new ArrayFront9();
        assertEquals(false, systemUnderTest.arrayFront9(new int[]{2}));
    }
    @Test
    void arrayFront9_9() {
        ArrayFront9 systemUnderTest = new ArrayFront9();
        assertEquals(true, systemUnderTest.arrayFront9(new int[]{9}));
    }
    @Test
    void arrayFront9_10() {
        ArrayFront9 systemUnderTest = new ArrayFront9();
        assertEquals(false, systemUnderTest.arrayFront9(new int[]{}));
    }
    @Test
    void arrayFront9_11() {
        ArrayFront9 systemUnderTest = new ArrayFront9();
        assertEquals(true, systemUnderTest.arrayFront9(new int[]{3, 9, 2, 3, 3}));
    }
    @Test
    void arrayFront9_12() {
        ArrayFront9 systemUnderTest = new ArrayFront9();
        assertEquals(false, systemUnderTest.arrayFront9(new int[]{5, 5}));
    }
}