package org.example.codingbat.warmup1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class parrotTrouble {

    private boolean implementation(boolean talking, int hour) {
        return implementation2(talking,hour);
    }

    private boolean implementation1(boolean talking, int hour) {
        if (hour < 0 || hour > 23){
            throw new RuntimeException("naucz sie zegarka");
        }
        return (talking && (hour < 7 || hour > 20));
    }

    private boolean implementation2(boolean talking, int hour) {
        if (hour < 0 || hour > 23){
            throw new RuntimeException("naucz sie zegarka");
        }

        if(talking && (hour < 7 || hour > 20)){
            return true;
        }

        return false;
    }

    @Test
    void when_true_and_6_return_true() {
        assertEquals(implementation(true, 6), true);
    }

    @Test
    void when_true_and_7_return_false() {
        assertEquals(implementation(true, 7), false);
    }

    @Test
    void when_false_and_6_return_false() {
        assertEquals(implementation(false, 6), false);
    }

    @Test
    void when_true_and_21_return_true() {
        assertEquals(implementation(true, 21), true);
    }

    @Test
    void when_false_and_21_return_false() {
        assertEquals(implementation(false, 21), false);
    }

    @Test
    void when_false_and_20_return_false() {
        assertEquals(implementation(false, 20), false);
    }

    @Test
    void when_true_and_23_return_true() {
        assertEquals(implementation(true, 23), true);
    }

    @Test
    void when_false_and_23_return_false() {
        assertEquals(implementation(false, 23), false);
    }

    @Test
    void when_true_and_20_return_false() {
        assertEquals(implementation(true, 20), false);
    }

    @Test
    void when_false_and_12_return_false() {
        assertEquals(implementation(false, 12), false);
    }

    @Test
    void when_true_and_26_return_true() {
        assertThrows(RuntimeException.class, () -> implementation(true, 26));
//        assertEquals(implementation(true, 26), true);
    }

}
