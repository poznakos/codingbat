import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartHiTest {

    @Test
    void startHi_if_word_start_hi() {
        StartHi systemUnderTest = new StartHi();
        assertEquals(true, systemUnderTest.startHi("hi there"));
    }
    @Test
    void startHi_if_word_not_start_hi() {
        StartHi systemUnderTest = new StartHi();
        assertEquals(false, systemUnderTest.startHi("there"));
    }
    @Test
    void startHi_if_word_is_empty() {
        StartHi systemUnderTest = new StartHi();
        assertEquals(false, systemUnderTest.startHi(""));
    }
    @Test
    void startHi_if_word_is_only_hi() {
        StartHi systemUnderTest = new StartHi();
        assertEquals(true, systemUnderTest.startHi("hi"));
    }
    @Test
    void startHi_if_word_is_only_h() {
        StartHi systemUnderTest = new StartHi();
        assertEquals(false, systemUnderTest.startHi("h"));
    }
}