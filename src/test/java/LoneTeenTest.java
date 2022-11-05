import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoneTeenTest {

    @Test
    void loneTeen_if_first_is_range_13_to_19_return_true() {
        LoneTeen systemUnderTest = new LoneTeen();
        assertEquals(true, systemUnderTest.loneTeen(15, 99));
    }

    @Test
    void loneTeen_if_second_is_range_13_to_19_return_true() {
        LoneTeen systemUnderTest = new LoneTeen();
        assertEquals(true, systemUnderTest.loneTeen(99, 15));
    }

    @Test
    void loneTeen_if_both_are_in_range_13_to_19_return_false() {
        LoneTeen systemUnderTest = new LoneTeen();
        assertEquals(false, systemUnderTest.loneTeen(13, 19));
    }

    @Test
    void loneTeen_if_both_are_not_in_range_13_to_19_return_false() {
        LoneTeen systemUnderTest = new LoneTeen();
        assertEquals(false, systemUnderTest.loneTeen(12, 20));
    }
}