import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AltPairsTest {

    @Test
    void altPairs_1() {
        AltPairs systemUnderTest = new AltPairs();
        assertEquals("kien", systemUnderTest.altPairs("kitten"));
    }
    @Test
    void altPairs_2() {
        AltPairs systemUnderTest = new AltPairs();
        assertEquals("Chole", systemUnderTest.altPairs("Chocolate"));
    }
    @Test
    void altPairs_3() {
        AltPairs systemUnderTest = new AltPairs();
        assertEquals("Congrr", systemUnderTest.altPairs("CodingHorror"));
    }
    @Test
    void altPairs_4() {
        AltPairs systemUnderTest = new AltPairs();
        assertEquals("ya", systemUnderTest.altPairs("yak"));
    }
    @Test
    void altPairs_5() {
        AltPairs systemUnderTest = new AltPairs();
        assertEquals("ya", systemUnderTest.altPairs("ya"));
    }
    @Test
    void altPairs_6() {
        AltPairs systemUnderTest = new AltPairs();
        assertEquals("y", systemUnderTest.altPairs("y"));
    }
    @Test
    void altPairs_7() {
        AltPairs systemUnderTest = new AltPairs();
        assertEquals("", systemUnderTest.altPairs(""));
    }
    @Test
    void altPairs_8() {
        AltPairs systemUnderTest = new AltPairs();
        assertEquals("ThThThth", systemUnderTest.altPairs("ThisThatTheOther"));
    }
}