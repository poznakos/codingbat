import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Start1Test {

    @Test
    void start1_Test1() {
        Start1 systemUnderTest = new Start1();
        assertEquals(2, systemUnderTest.start1(new int[]{1, 2, 3}, new int[]{1, 3}));
    }
    void start1_Test2() {
        Start1 systemUnderTest = new Start1();
        assertEquals(1, systemUnderTest.start1(new int[]{7, 2, 3}, new int[]{1}));
    }
    void start1_Test3() {
        Start1 systemUnderTest = new Start1();
        assertEquals(1, systemUnderTest.start1(new int[]{1, 2}, new int[]{}));
    }
}