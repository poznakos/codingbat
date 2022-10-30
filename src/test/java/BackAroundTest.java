import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackAroundTest {

    @Test
    void backAround_if_cat_should_return_tcatt() {
        BackAround systemUnderTest = new BackAround();
        assertEquals("tcatt", systemUnderTest.backAround("cat"));
    }
    @Test
    void backAround_if_hello_should_return_oHello() {
        BackAround systemUnderTest = new BackAround();
        assertEquals("oHelloo", systemUnderTest.backAround("Hello"));
    }
    @Test
    void backAround_if_a_should_return_aaa() {
        BackAround systemUnderTest = new BackAround();
        assertEquals("aaa", systemUnderTest.backAround("a"));
    }
    @Test
    void backAround_if_abc_should_return_cabcc() {
        BackAround systemUnderTest = new BackAround();
        assertEquals("cabcc", systemUnderTest.backAround("abc"));
    }
    @Test
    void backAround_if_read_should_return_dreadd() {
        BackAround systemUnderTest = new BackAround();
        assertEquals("dreadd", systemUnderTest.backAround("read"));
    }
    @Test
    void backAround_if_boo_should_return_obooo() {
        BackAround systemUnderTest = new BackAround();
        assertEquals("obooo", systemUnderTest.backAround("boo"));
    }
}