import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameFirstLastTest {

    @Test
    void sameFirstLast_when_array_is_empty_than_false() {
        SameFirstLast systemUnderTest = new SameFirstLast();
        assertEquals(false, systemUnderTest.sameFirstLast(new int[]{}));
    }
    @Test
    void sameFirstLast_when_array_is_lenght_of_1_than_true() {
        SameFirstLast systemUnderTest = new SameFirstLast();
        assertEquals(true, systemUnderTest.sameFirstLast(new int[]{3}));
    }
    @Test
    void sameFirstLast_when_array_is_first_equals_last_than_true() {
        SameFirstLast systemUnderTest = new SameFirstLast();
        assertEquals(true, systemUnderTest.sameFirstLast(new int[]{2, 3, 3, 2}));
    }
    @Test
    void sameFirstLast_when_array_is_first_not_equals_last_than_false() {
        SameFirstLast systemUnderTest = new SameFirstLast();
        assertEquals(false, systemUnderTest.sameFirstLast(new int[]{2, 3, 3, 4}));
    }
}