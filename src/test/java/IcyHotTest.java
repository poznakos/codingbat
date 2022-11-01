import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class IcyHotTest {

    static IcyHot systemUnderTest;

    @BeforeAll
    static void before() {
        systemUnderTest = new IcyHot();
    }

    @Test
    void icyHot_when_first_is_120_secend_is_negative_1_return_true() {
        assertEquals(true, systemUnderTest.icyHot(120, -1));
    }
    @Test
    void icyHot_when_first_is_negative_1_secend_is_120_return_true() {
        assertEquals(true, systemUnderTest.icyHot(-1, 120));
    }
    @Test
    void icyHot_when_first_is_2_secend_is_120_return_false() {
        assertEquals(false, systemUnderTest.icyHot(2, 120));
    }
    @Test
    void icyHot_when_first_is_negative_1_secend_is_100_return_false() {
        assertEquals(false, systemUnderTest.icyHot(-1, 100));
    }
    @Test
    void icyHot_when_first_is_negative_2_secend_is_negative_2_return_false() {
        assertEquals(false, systemUnderTest.icyHot(-2, -2));
    }
    @Test
    void icyHot_when_first_is_120_secend_is_120_return_false() {
        assertEquals(false, systemUnderTest.icyHot(120, 120));
    }
}