import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Math1Test {

    @Test
    void math1_1() {
        Math1 systemUnderTest = new Math1();
        List<Integer> expected = new ArrayList<>();
        expected.add(20);
        expected.add(30);
        expected.add(40);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        assertEquals(expected, systemUnderTest.math1(actual));
    }
    @Test
    void math1_2() {
        Math1 systemUnderTest = new Math1();
        List<Integer> expected = new ArrayList<>();
        expected.add(70);
        expected.add(90);
        expected.add(70);
        expected.add(90);
        expected.add(20);
        List<Integer> actual = new ArrayList<>();
        actual.add(6);
        actual.add(8);
        actual.add(6);
        actual.add(8);
        actual.add(1);
        assertEquals(expected, systemUnderTest.math1(actual));
    }
    @Test
    void math1_3() {
        Math1 systemUnderTest = new Math1();
        List<Integer> expected = new ArrayList<>();
        expected.add(110);
        List<Integer> actual = new ArrayList<>();
        actual.add(10);
        assertEquals(expected, systemUnderTest.math1(actual));
    }
}