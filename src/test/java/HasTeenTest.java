import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasTeenTest {

    @Test
    void hasTeen_when_is_13_is_20_is_10_than_true() {
        HasTeen systemUnderTest = new HasTeen();
        assertEquals(true, systemUnderTest.hasTeen(13, 20, 10));
    }
    @Test
    void no_Teen_when_is_1_is_12_is_10_than_false() {
        HasTeen systemUnderTest = new HasTeen();
        assertEquals(false, systemUnderTest.hasTeen(1, 12, 10));
    }
}