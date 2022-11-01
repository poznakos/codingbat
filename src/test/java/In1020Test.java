import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In1020Test {

    @Test
    void in1020_when_is_12_and_99_return_true() {
        In1020 systemUnderTest = new In1020();
        assertEquals(true, systemUnderTest.in1020(12, 99));
    }
    @Test
    void in1020_when_is_21_and_12_return_true() {
        In1020 systemUnderTest = new In1020();
        assertEquals(true, systemUnderTest.in1020(21, 12));
    }
    @Test
    void in1020_when_is_8_and_99_return_false() {
        In1020 systemUnderTest = new In1020();
        assertEquals(false, systemUnderTest.in1020(8, 99));
    }
    @Test
    void in1020_when_is_99_and_10_return_true() {
        In1020 systemUnderTest = new In1020();
          assertEquals(true, systemUnderTest.in1020(99, 10));
    }
    @Test
    void in1020_when_is_20_and_20_return_true() {
        In1020 systemUnderTest = new In1020();
        assertEquals(true, systemUnderTest.in1020(20, 20));
    }
    @Test
    void in1020_when_is_21_and_21_return_false() {
        In1020 systemUnderTest = new In1020();
        assertEquals(false, systemUnderTest.in1020(21, 21));
    }
    @Test
    void in1020_when_is_9_and_9_return_false() {
        In1020 systemUnderTest = new In1020();
        assertEquals(false, systemUnderTest.in1020(9, 9));
    }
}