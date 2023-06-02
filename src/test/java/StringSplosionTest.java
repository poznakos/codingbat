import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSplosionTest {

    @Test
    void stringSplosion_1() {
        StringSplosion systemUnderTest = new StringSplosion();
        assertEquals("CCoCodCode", systemUnderTest.stringSplosion("Code"));
    }
    @Test
    void stringSplosion_2() {
        StringSplosion systemUnderTest = new StringSplosion();
        assertEquals("aababc", systemUnderTest.stringSplosion("abc"));
    }
    @Test
    void stringSplosion_3() {
        StringSplosion systemUnderTest = new StringSplosion();
        assertEquals("aab", systemUnderTest.stringSplosion("ab"));
    }
    @Test
    void stringSplosion_4() {
        StringSplosion systemUnderTest = new StringSplosion();
        assertEquals("x", systemUnderTest.stringSplosion("x"));
    }
    @Test
    void stringSplosion_5() {
        StringSplosion systemUnderTest = new StringSplosion();
        assertEquals("ffafadfade", systemUnderTest.stringSplosion("fade"));
    }
    @Test
    void stringSplosion_6() {
        StringSplosion systemUnderTest = new StringSplosion();
        assertEquals("TThTheTherThere", systemUnderTest.stringSplosion("There"));
    }
    @Test
    void stringSplosion_7() {
        StringSplosion systemUnderTest = new StringSplosion();
        assertEquals("KKiKitKittKitteKitten", systemUnderTest.stringSplosion("Kitten"));
    }
    @Test
    void stringSplosion_8() {
        StringSplosion systemUnderTest = new StringSplosion();
        assertEquals("BByBye", systemUnderTest.stringSplosion("Bye"));
    }
    @Test
    void stringSplosion_9() {
        StringSplosion systemUnderTest = new StringSplosion();
        assertEquals("GGoGooGood", systemUnderTest.stringSplosion("Good"));
    }
    @Test
    void stringSplosion_10() {
        StringSplosion systemUnderTest = new StringSplosion();
        assertEquals("BBaBad", systemUnderTest.stringSplosion("Bad"));
    }
}