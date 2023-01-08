import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Has12Test {

    @Test
    void has12_1() {
        Has12 systemUnderTest = new Has12();
        assertEquals(true, systemUnderTest.has12(new int[]{1, 2, 3}));
    }
    @Test
    void has12_2() {
        Has12 systemUnderTest = new Has12();
        assertEquals(true, systemUnderTest.has12(new int[]{3, 1, 2}));
    }
    @Test
    void has12_3() {
        Has12 systemUnderTest = new Has12();
        assertEquals(true, systemUnderTest.has12(new int[]{3, 1, 4, 5, 2}));
    }
    @Test
    void has12_4() {
        Has12 systemUnderTest = new Has12();
        assertEquals(false, systemUnderTest.has12(new int[]{3, 2, 1}));
    }
    @Test
    void has12_5() {
        Has12 systemUnderTest = new Has12();
        assertEquals(false, systemUnderTest.has12(new int[]{2, 1, 4, 1, 6}));
    }
}