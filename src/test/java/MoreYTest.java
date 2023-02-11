import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoreYTest {

    @Test
    void moreY_1() {
        MoreY systemUnderTest = new MoreY();
        List<String> expected = new ArrayList<>();
        expected.add("yay");
        expected.add("yby");
        expected.add("ycy");
        List<String> actual = new ArrayList<>();
        actual.add("a");
        actual.add("b");
        actual.add("c");
        assertEquals(expected, systemUnderTest.moreY(actual));
    }
    @Test
    void moreY_2() {
        MoreY systemUnderTest = new MoreY();
        List<String> expected = new ArrayList<>();
        expected.add("yhelloy");
        expected.add("ytherey");
        List<String> actual = new ArrayList<>();
        actual.add("hello");
        actual.add("there");
        assertEquals(expected, systemUnderTest.moreY(actual));
    }
    @Test
    void moreY_3() {
        MoreY systemUnderTest = new MoreY();
        List<String> expected = new ArrayList<>();
        expected.add("yyayy");
        List<String> actual = new ArrayList<>();
        actual.add("yay");
        assertEquals(expected, systemUnderTest.moreY(actual));
    }
}