import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array667Test {

    @Test
    void array667_1() {
        Array667 systemUnderTest = new Array667();
        assertEquals(1, systemUnderTest.array667(new int[]{6, 6, 2}));
    }
    @Test
    void array667_2() {
        Array667 systemUnderTest = new Array667();
        assertEquals(1, systemUnderTest.array667(new int[]{6, 6, 2, 6}));
    }
    @Test
    void array667_3() {
        Array667 systemUnderTest = new Array667();
        assertEquals(1, systemUnderTest.array667(new int[]{6, 7, 2, 6}));
    }
    @Test
    void array667_4() {
        Array667 systemUnderTest = new Array667();
        assertEquals(2, systemUnderTest.array667(new int[]{6, 6, 2, 6, 7}));
    }
    @Test
    void array667_5() {
        Array667 systemUnderTest = new Array667();
        assertEquals(0, systemUnderTest.array667(new int[]{1, 6, 3}));
    }
    @Test
    void array667_6() {
        Array667 systemUnderTest = new Array667();
        assertEquals(0, systemUnderTest.array667(new int[]{6, 1}));
    }
    @Test
    void array667_7() {
        Array667 systemUnderTest = new Array667();
        assertEquals(0, systemUnderTest.array667(new int[]{}));
    }
    @Test
    void array667_8() {
        Array667 systemUnderTest = new Array667();
        assertEquals(1, systemUnderTest.array667(new int[]{3, 6, 7, 6}));
    }
    @Test
    void array667_9() {
        Array667 systemUnderTest = new Array667();
        assertEquals(2, systemUnderTest.array667(new int[]{3, 6, 6, 7}));
    }
    @Test
    void array667_10() {
        Array667 systemUnderTest = new Array667();
        assertEquals(1, systemUnderTest.array667(new int[]{6, 3, 6, 6}));
    }
    @Test
    void array667_11() {
        Array667 systemUnderTest = new Array667();
        assertEquals(2, systemUnderTest.array667(new int[]{6, 7, 6, 6}));
    }
    @Test
    void array667_12() {
        Array667 systemUnderTest = new Array667();
        assertEquals(0, systemUnderTest.array667(new int[]{1, 2, 3, 5, 6}));
    }
    @Test
    void array667_13() {
        Array667 systemUnderTest = new Array667();
        assertEquals(1, systemUnderTest.array667(new int[]{1, 2, 3, 6, 6}));
    }
}