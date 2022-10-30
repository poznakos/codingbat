package org.example.codingbat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Diff21Test {

    @Test
    void diff21_if_19_return_2() {
        Diff21 systemUnderTest = new Diff21();
        assertEquals(2, systemUnderTest.diff21(19));
    }
    @Test
    void diff21_if_10_return_11() {
        Diff21 systemUnderTest = new Diff21();
        assertEquals(11, systemUnderTest.diff21(10));
    }
    @Test
    void diff21_if_21_return_0() {
        Diff21 systemUnderTest = new Diff21();
        assertEquals(0, systemUnderTest.diff21(21));
    }
    @Test
    void diff21_if_22_return_2() {
        Diff21 systemUnderTest = new Diff21();
        assertEquals(2, systemUnderTest.diff21(22));
    }
    @Test
    void diff21_if_25_return_8() {
        Diff21 systemUnderTest = new Diff21();
        assertEquals(8, systemUnderTest.diff21(25));
    }
    @Test
    void diff21_if_30_return_18() {
        Diff21 systemUnderTest = new Diff21();
        assertEquals(18, systemUnderTest.diff21(30));
    }
}