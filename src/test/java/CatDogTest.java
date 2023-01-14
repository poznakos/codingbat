import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatDogTest {

    @Test
    void catDog_1() {
        CatDog systemUnderTest = new CatDog();
        assertTrue(systemUnderTest.catDog("catdog"));
    }
    @Test
    void catDog_2() {
        CatDog systemUnderTest = new CatDog();
        assertFalse(systemUnderTest.catDog("catcat"));
    }
    @Test
    void catDog_3() {
        CatDog systemUnderTest = new CatDog();
        assertTrue(systemUnderTest.catDog("1cat1cadodog"));
    }
}