import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array123Test {

    @Test
    void array123_1() {
        Array123 systemUnderTest = new Array123();
        assertEquals(true, systemUnderTest.array123(new int[]{1, 1, 2, 3, 1}));
    }
    @Test
    void array123_2() {
        Array123 systemUnderTest = new Array123();
        assertEquals(false, systemUnderTest.array123(new int[]{1, 1, 2, 4, 1}));
    }
    @Test
    void array123_3() {
        Array123 systemUnderTest = new Array123();
        assertEquals(true, systemUnderTest.array123(new int[]{1, 1, 2, 1, 2, 3}));
    }
    @Test
    void array123_4() {
        Array123 systemUnderTest = new Array123();
        assertEquals(false, systemUnderTest.array123(new int[]{1, 1, 2, 1, 2, 1}));
    }
    @Test
    void array123_5() {
        Array123 systemUnderTest = new Array123();
        assertEquals(true, systemUnderTest.array123(new int[]{1, 2, 3, 1, 2, 3}));
    }
    @Test
    void array123_6() {
        Array123 systemUnderTest = new Array123();
        assertEquals(true, systemUnderTest.array123(new int[]{1, 2, 3}));
    }
    @Test
    void array123_7() {
        Array123 systemUnderTest = new Array123();
        assertEquals(false, systemUnderTest.array123(new int[]{1, 1, 1}));
    }
    @Test
    void array123_8() {
        Array123 systemUnderTest = new Array123();
        assertEquals(false, systemUnderTest.array123(new int[]{1, 2}));
    }
    @Test
    void array123_9() {
        Array123 systemUnderTest = new Array123();
        assertEquals(false, systemUnderTest.array123(new int[]{1}));
    }
    @Test
    void array123_10() {
        Array123 systemUnderTest = new Array123();
        assertEquals(false, systemUnderTest.array123(new int[]{}));
    }
}