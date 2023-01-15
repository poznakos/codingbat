import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void square_1() {
        Square systemUnderTest = new Square();
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(4);
        expected.add(9);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        assertEquals(expected, systemUnderTest.square(actual));
    }
    @Test
    void square_2() {
        Square systemUnderTest = new Square();
        List<Integer> expected = new ArrayList<>();
        expected.add(36);
        expected.add(64);
        expected.add(36);
        expected.add(64);
        expected.add(1);
        List<Integer> actual = new ArrayList<>();
        actual.add(6);
        actual.add(8);
        actual.add(-6);
        actual.add(-8);
        actual.add(1);
        assertEquals(expected, systemUnderTest.square(actual));
    }
    @Test
    void square_3() {
        Square systemUnderTest = new Square();
        List<Integer> expected = new ArrayList<>();
        List<Integer> actual = new ArrayList<>();
        assertEquals(expected, systemUnderTest.square(actual));
    }
}