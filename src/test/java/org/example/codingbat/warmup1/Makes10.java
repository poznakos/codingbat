package org.example.codingbat.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Makes10 {
    public boolean makes10(int a, int b) {
        return makes10_4(a, b);
    }

    public boolean makes10_4(int a, int b) {
        return (isAnyEquals10(a, b) || a + b == 10);
    }

    private boolean isAnyEquals10(int a, int b) {
        return is10(a) || is10(b);
    }

    private boolean is10(int i) {
        return i == 10;
    }

    public boolean makes10_3(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    public boolean makes10_2(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }

    public boolean makes10_1(int a, int b) {
        if (a == 10) {
            return true;
        }
        if (b == 10) {
            return true;
        }
        if (a + b == 10) {
            return true;
        }
        return false;
    }

    @Test
    public void if_a_equals_9_and_b_equals_10_then_return_true() {
        assertEquals(makes10(9, 10), true);
    }

    @Test
    public void if_a_equals_10_and_b_equals_9_then_return_true() {
        assertEquals(makes10(10, 9), true);
    }

    @Test
    public void if_a_equals_4_and_b_equals_6_then_return_true() {
        assertEquals(makes10(4, 6), true);
    }

    @Test
    public void if_a_equals_4_and_b_equals_5_then_return_false() {
        assertEquals(makes10(4, 5), false);
    }

}
