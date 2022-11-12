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
    void start1_Test4() {
        Start1 systemUnderTest = new Start1();
        assertEquals(1, systemUnderTest.start1(new int[]{}, new int[]{1,2}));
    }
    void start1_Test5() {
        Start1 systemUnderTest = new Start1();
        assertEquals(0, systemUnderTest.start1(new int[]{7}, new int[]{}));
    }
    void start1_Test6() {
        Start1 systemUnderTest = new Start1();
        assertEquals(0, systemUnderTest.start1(new int[]{}, new int[]{}));
    }
}