import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Copies3Test {

    @Test
    void copies3_1() {
        Copies3 systemUnderTest = new Copies3();
        List<String> expected = new ArrayList<>();
        expected.add("aaa");
        expected.add("bbbbbb");
        expected.add("ccccccccc");
        List<String> actual = new ArrayList<>();
        actual.add("a");
        actual.add("bb");
        actual.add("ccc");
        assertEquals(expected, systemUnderTest.copies3(actual));
    }
    @Test
    void copies3_2() {
        Copies3 systemUnderTest2 = new Copies3();
        List<String> expected = new ArrayList<>();
        expected.clear();
        expected.add("242424");
        expected.add("aaa");
        expected.add("");
        List<String> actual = new ArrayList<>();
        actual.add("24");
        actual.add("a");
        actual.add("");
        assertEquals(expected, systemUnderTest2.copies3(actual));
    }
    @Test
    void copies3_3() {
        Copies3 systemUnderTest3 = new Copies3();
        List<String> expected = new ArrayList<>();
        expected.add("hellohellohello");
        expected.add("theretherethere");
        List<String> actual = new ArrayList<>();
        actual.add("hello");
        actual.add("there");
        assertEquals(expected, systemUnderTest3.copies3(actual));
    }
}