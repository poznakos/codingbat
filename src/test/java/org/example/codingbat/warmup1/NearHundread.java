package org.example.codingbat.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NearHundread {
    public boolean nearHundred(int n) {
        return nearHundred_v1(n);
    }

    public boolean nearHundred_v1(int n) {
        if (n >= 90 && n <= 110 || n >= 190 && n <= 210) {
            return true;
        }
        return false;
    }

    public boolean nearHundred_1(int n) {
        return (n >= 90 && n <= 110 || n >= 190 && n <= 210);
    }

    public boolean nearHundred_2(int n) {
        if (n >= 90 || n <= 110) {
            return true;
        }
        if (n >= 190 || n <= 210) {
            return true;
        }
        return false;
    }

    @Test
    public void if_n_equals_190_return_true() {
        assertEquals(nearHundred(190), true);
    }

    @Test
    public void if_n_equals_90_return_true() {
        assertEquals(nearHundred(90), true);
    }

    @Test
    public void if_n_equals_210_return_true() {
        assertEquals(nearHundred(210), true);
    }

    @Test
    public void if_n_equals_110_return_true() {
        assertEquals(nearHundred(110), true);
    }

    @Test
    public void if_n_equals_150_return_false() {
        assertEquals(nearHundred(150), false);
    }
}
