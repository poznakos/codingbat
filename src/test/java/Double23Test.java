import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Double23Test {

    @Test
    void double23_when_array_lenght_more_than_2_than_false() {
        Double23 systemUnderTest = new Double23();
        assertEquals(false, systemUnderTest.double23(new int[]{1,2,3}));
    }
    @Test
    void double23_when_array_lenght_is_0_than_false() {
        Double23 systemUnderTest = new Double23();
        assertEquals(false, systemUnderTest.double23(new int[]{}));
    }
    @Test
    void double23_when_array_lenght_is_1_than_false() {
        Double23 systemUnderTest = new Double23();
        assertEquals(false, systemUnderTest.double23(new int[]{2}));
    }
    @Test
    void double23_when_array_have_2_twice_than_true() {
        Double23 systemUnderTest = new Double23();
        assertEquals(true, systemUnderTest.double23(new int[]{2,2}));
    }
    @Test
    void double23_when_array_have_3_twice_than_true() {
        Double23 systemUnderTest = new Double23();
        assertEquals(true, systemUnderTest.double23(new int[]{3,3}));
    }
    @Test
    void double23_when_array_have_2_only_one_than_false() {
        Double23 systemUnderTest = new Double23();
        assertEquals(false, systemUnderTest.double23(new int[]{2,3}));
    }
    @Test
    void double23_when_array_have_3_only_one_than_false() {
        Double23 systemUnderTest = new Double23();
        assertEquals(false, systemUnderTest.double23(new int[]{2,3}));
    }
    @Test
    void double23_when_array_have_no_2_or_3_than_false() {
        Double23 systemUnderTest = new Double23();
        assertEquals(false, systemUnderTest.double23(new int[]{4,5}));
    }
}