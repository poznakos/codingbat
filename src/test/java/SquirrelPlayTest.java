import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquirrelPlayTest {

    @Test
    void squirrelPlay_1() {
        SquirrelPlay systemUnderTest = new SquirrelPlay();
        assertEquals(true, systemUnderTest.squirrelPlay(70, false));
    }
    @Test
    void squirrelPlay_2() {
        SquirrelPlay systemUnderTest = new SquirrelPlay();
        assertEquals(false, systemUnderTest.squirrelPlay(95, false));
    }
    @Test
    void squirrelPlay_3() {
        SquirrelPlay systemUnderTest = new SquirrelPlay();
        assertEquals(true, systemUnderTest.squirrelPlay(95, true));
    }
    @Test
    void squirrelPlay_4() {
        SquirrelPlay systemUnderTest = new SquirrelPlay();
        assertEquals(false, systemUnderTest.squirrelPlay(59, true));
    }
}