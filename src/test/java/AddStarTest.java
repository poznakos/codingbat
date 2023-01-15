import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddStarTest {

    @Test
    void addStar_1() {
        AddStar systemUnderTest = new AddStar();
        List<String> expected = new ArrayList<>();
        expected.add("a*");
        expected.add("bb*");
        expected.add("ccc*");
        List<String> actual = new ArrayList<>();
        actual.add("a");
        actual.add("bb");
        actual.add("ccc");
        assertEquals(expected, systemUnderTest.addStar(actual));
    }
    @Test
    void addStar_2() {
        AddStar systemUnderTest = new AddStar();
        List<String> expected = new ArrayList<>();
        expected.add("hello*");
        expected.add("there*");
        List<String> actual = new ArrayList<>();
        actual.add("hello");
        actual.add("there");
        assertEquals(expected, systemUnderTest.addStar(actual));
    }
    @Test
    void addStar_3() {
        AddStar systemUnderTest = new AddStar();
        List<String> expected = new ArrayList<>();
        expected.add("**");
        List<String> actual = new ArrayList<>();
        actual.add("*");
        assertEquals(expected, systemUnderTest.addStar(actual));
    }
}