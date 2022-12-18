import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoneSumTest {

    @Test
    void loneSum_nr1() {
        LoneSum systemUnderTest = new LoneSum();
        assertEquals(6, systemUnderTest.loneSum(1,2,3));
    }

    @Test
    void loneSum_nr2() {
        LoneSum systemUnderTest = new LoneSum();
        assertEquals(2, systemUnderTest.loneSum(3,2,3));
    }

    @Test
    void loneSum_nr3() {
        LoneSum systemUnderTest = new LoneSum();
        assertEquals(0, systemUnderTest.loneSum(3,3,3));
    }

    @Test
    void loneSum_nr4() {
        LoneSum systemUnderTest = new LoneSum();
        assertEquals(9, systemUnderTest.loneSum(9,2,2));
    }

    @Test
    void loneSum_nr5() {
        LoneSum systemUnderTest = new LoneSum();
        assertEquals(9, systemUnderTest.loneSum(2,2,9));
    }
}