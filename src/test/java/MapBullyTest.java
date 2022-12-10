import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapBullyTest {

    @Test
    void mapBully_1() {
        MapBully systemUnderTest = new MapBully();

        Map<String, String> inputMap= new HashMap<String, String>();
        inputMap.put("a", "candy");
        inputMap.put("b", "dirt");

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("a", "");
        expected.put("b", "candy");

        assertEquals(expected.get("a"), systemUnderTest.mapBully(inputMap).get("a"));
        assertEquals(expected.get("b"), systemUnderTest.mapBully(inputMap).get("b"));

    }
    @Test
    void mapBully_2() {
        MapBully systemUnderTest = new MapBully();

        Map<String, String> inputMap= new HashMap<String, String>();
        inputMap.put("a", "candy");

        Map<String, String> expected = new HashMap<String, String>();
        expected.put("a", "");
        expected.put("b", "candy");


        assertEquals(expected.get("a"), systemUnderTest.mapBully(inputMap).get("a"));
        assertEquals(expected.get("b"), systemUnderTest.mapBully(inputMap).get("b"));

    }
    @Test
    void mapBully_3() {
        MapBully systemUnderTest = new MapBully();
        Map<String, String> expected = new HashMap<String, String>();
        expected.put("a", "");
        expected.put("b", "candy");
        expected.put("c", "meh");

        Map<String, String> inputMap= new HashMap<String, String>();
        inputMap.put("a", "candy");
        inputMap.put("b", "dirt");
        inputMap.put("c", "meh");

        assertEquals(expected.get("a"), systemUnderTest.mapBully(inputMap).get("a"));
        assertEquals(expected.get("b"), systemUnderTest.mapBully(inputMap).get("b"));
        assertEquals(expected.get("c"), systemUnderTest.mapBully(inputMap).get("c"));
    }
    @Test
    void mapBully_4() {
        MapBully systemUnderTest = new MapBully();
        Map<String, String> expected = new HashMap<String, String>();
        expected.put("c", "meh");

        Map<String, String> inputMap= new HashMap<String, String>();
        inputMap.put("c", "meh");

        inputMap.equals(expected);

//        assertEquals(expected.get("c"), systemUnderTest.mapBully(inputMap).get("c"));
        assertEquals(expected, systemUnderTest.mapBully(inputMap));
    }

}