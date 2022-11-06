import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLast6Test {

    @Test
    void firstLast6_last_is_6_than_true() {
        FirstLast6 systemUnderTest = new FirstLast6();
        assertEquals(true, systemUnderTest.firstLast6(new int[]{1, 2, 6}));
    }
    @Test
    void firstLast6_first_is_6_than_true() {
        FirstLast6 systemUnderTest = new FirstLast6();
        assertEquals(true, systemUnderTest.firstLast6(new int[]{6, 1, 2, 3}));
    }
    @Test
    void firstLast6_second_is_6_than_false() {
        FirstLast6 systemUnderTest = new FirstLast6();
        assertEquals(false, systemUnderTest.firstLast6(new int[]{13, 6, 1, 2, 3}));
    }
    @Test
    void firstLast6_empty_array_than_false() {
        FirstLast6 systemUnderTest = new FirstLast6();
        assertEquals(false, systemUnderTest.firstLast6(new int[]{}));
    }
}