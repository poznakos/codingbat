import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pre4Test {

    @Test
    void pre4_1() {
        Pre4 systemUnderTest = new Pre4();
        assertArrayEquals(new int[]{1, 2}, systemUnderTest.pre4(new int[]{1, 2, 4, 1}));
    }
    @Test
    void pre4_2() {
        Pre4 systemUnderTest = new Pre4();
        assertArrayEquals(new int[]{3, 1}, systemUnderTest.pre4(new int[]{3, 1, 4}));
    }
    @Test
    void pre4_3() {
        Pre4 systemUnderTest = new Pre4();
        assertArrayEquals(new int[]{1}, systemUnderTest.pre4(new int[]{1, 4, 4}));
    }
}