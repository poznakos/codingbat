import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DelDelTest {

    @Test
    void delDel_if_del_at_index_1() {
        DelDel systemUnderTest = new DelDel();
        assertEquals("abc", systemUnderTest.delDel("adelbc"));
    }
    @Test
    void delDel_if_del_at_another_index() {
        DelDel systemUnderTest = new DelDel();
        assertEquals("aadelc", systemUnderTest.delDel("aadelc"));
    }
    @Test
    void delDel_if_no_del() {
        DelDel systemUnderTest = new DelDel();
        assertEquals("adedbc", systemUnderTest.delDel("adedbc"));
    }
}