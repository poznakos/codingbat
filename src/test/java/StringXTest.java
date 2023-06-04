import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringXTest {

    @Test
    void stringX_1() {
        StringX systemUnderTest = new StringX();
        assertEquals("xHix", systemUnderTest.stringX("xxHxix"));
    }
    @Test
    void stringX_2() {
        StringX systemUnderTest = new StringX();
        assertEquals("abcd", systemUnderTest.stringX("abxxxcd"));
    }
    @Test
    void stringX_3() {
        StringX systemUnderTest = new StringX();
        assertEquals("xabcdx", systemUnderTest.stringX("xabxxxcdx"));
    }
    @Test
    void stringX_4() {
        StringX systemUnderTest = new StringX();
        assertEquals("xKittenx", systemUnderTest.stringX("xKittenx"));
    }
    @Test
    void stringX_5() {
        StringX systemUnderTest = new StringX();
        assertEquals("Hello", systemUnderTest.stringX("Hello"));
    }
    @Test
    void stringX_6() {
        StringX systemUnderTest = new StringX();
        assertEquals("xx", systemUnderTest.stringX("xx"));
    }
    @Test
    void stringX_7() {
        StringX systemUnderTest = new StringX();
        assertEquals("x", systemUnderTest.stringX("x"));
    }
    @Test
    void stringX_8() {
        StringX systemUnderTest = new StringX();
        assertEquals("", systemUnderTest.stringX(""));
    }
    @Test
    void stringX_9() {
        StringX systemUnderTest = new StringX();
        assertEquals("xx", systemUnderTest.stringX("xxx"));
    }
}