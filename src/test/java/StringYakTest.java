import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringYakTest {

    @Test
    void stringYak_1() {
        StringYak systemUnderTest = new StringYak();
        assertEquals("pak", systemUnderTest.stringYak("yakpak"));
    }
    @Test
    void stringYak_2() {
        StringYak systemUnderTest = new StringYak();
        assertEquals("pak", systemUnderTest.stringYak("pakyak"));
    }
    @Test
    void stringYak_3() {
        StringYak systemUnderTest = new StringYak();
        assertEquals("123ya", systemUnderTest.stringYak("yak123ya"));
    }
    @Test
    void stringYak_4() {
        StringYak systemUnderTest = new StringYak();
        assertEquals("", systemUnderTest.stringYak("yak"));
    }
    @Test
    void stringYak_5() {
        StringYak systemUnderTest = new StringYak();
        assertEquals("xxx", systemUnderTest.stringYak("yakxxxyak"));
    }
    @Test
    void stringYak_6() {
        StringYak systemUnderTest = new StringYak();
        assertEquals("HiHi", systemUnderTest.stringYak("HiyakHi"));
    }
    @Test
    void stringYak_7() {
        StringYak systemUnderTest = new StringYak();
        assertEquals("xxxyyzzz", systemUnderTest.stringYak("xxxyakyyyakzzz"));
    }
}