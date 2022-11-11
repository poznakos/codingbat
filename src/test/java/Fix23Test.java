import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Fix23Test {

    @Test
    void fix23_if_array_is_1_2_3() {
        Fix23 systemUnderTest = new Fix23();
        assertArrayEquals(new int[]{1,2,0}, systemUnderTest.fix23(new int[]{1, 2, 3}));
    }
    @Test
    void fix23_if_array_is_2_3_5() {
        Fix23 systemUnderTest = new Fix23();
        assertArrayEquals(new int[]{2,0,5}, systemUnderTest.fix23(new int[]{2, 3, 5}));
    }
    @Test
    void fix23_if_array_is_1_2_1() {
        Fix23 systemUnderTest = new Fix23();
        assertArrayEquals(new int[]{1,2,1}, systemUnderTest.fix23(new int[]{1, 2, 1}));
    }
}