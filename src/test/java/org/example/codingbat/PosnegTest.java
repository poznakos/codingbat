package org.example.codingbat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PosnegTest {

    @Test
    void posNeg_test1() {
        Posneg systemUnderTest = new Posneg();
        assertEquals(true, systemUnderTest.posNeg(1, -1, false));
    }
    @Test
    void posNeg_test2() {
        Posneg systemUnderTest = new Posneg();
        assertEquals(true, systemUnderTest.posNeg(-1, -1, true));
    }
    @Test
    void posNeg_test3() {
        Posneg systemUnderTest = new Posneg();
        assertEquals(true, systemUnderTest.posNeg(-4, -5, true));
    }
    @Test
    void posNeg_test4() {
        Posneg systemUnderTest = new Posneg();
        assertEquals(false, systemUnderTest.posNeg(-4, -5, false));
    }
    @Test
    void posNeg_test5() {
        Posneg systemUnderTest = new Posneg();
        assertEquals(false, systemUnderTest.posNeg(-4, 5, true));
    }
    @Test
    void posNeg_test6() {
        Posneg systemUnderTest = new Posneg();
        assertEquals(true, systemUnderTest.posNeg(-4, 5, false));
    }
    @Test
    void posNeg_test7() {
        Posneg systemUnderTest = new Posneg();
        assertEquals(false, systemUnderTest.posNeg(1, 1, false));
    }
    @Test
    void posNeg_test8() {
        Posneg systemUnderTest = new Posneg();
        assertEquals(false, systemUnderTest.posNeg(-1, -1, false));
    }
    @Test
    void posNeg_test9() {
        Posneg systemUnderTest = new Posneg();
        assertEquals(false, systemUnderTest.posNeg(1, -1, true));
    }
    @Test
    void posNeg_test10() {
        Posneg systemUnderTest = new Posneg();
        assertEquals(false, systemUnderTest.posNeg(-1, 1, true));
    }
    @Test
    void posNeg_test11() {
        Posneg systemUnderTest = new Posneg();
        assertEquals(false, systemUnderTest.posNeg(1, 1, true));
    }
}