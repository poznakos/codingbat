import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoublingTest {

    @Test
    void doubling_1() {
        Doubling systemUnderTest = new Doubling();
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        assertEquals(expected, systemUnderTest.doubling(actual));
    }
    @Test
    void doubling_2() {
        Doubling systemUnderTest = new Doubling();
        List<Integer> expected = new ArrayList<>();
        expected.add(12);
        expected.add(16);
        expected.add(12);
        expected.add(16);
        expected.add(-2);
        List<Integer> actual = new ArrayList<>();
        actual.add(6);
        actual.add(8);
        actual.add(6);
        actual.add(8);
        actual.add(-1);
        assertEquals(expected, systemUnderTest.doubling(actual));
    }
    @Test
    void doubling_3() {
        Doubling systemUnderTest = new Doubling();
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        assertEquals(expected, systemUnderTest.doubling(actual));
    }
}