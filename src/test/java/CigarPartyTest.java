import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CigarPartyTest {

    @Test
    void cigarParty_1() {
        CigarParty systemUnderTest = new CigarParty();
        assertEquals(false, systemUnderTest.cigarParty(30, false));
    }
    @Test
    void cigarParty_2() {
        CigarParty systemUnderTest = new CigarParty();
        assertEquals(true, systemUnderTest.cigarParty(50, false));
    }
    @Test
    void cigarParty_3() {
        CigarParty systemUnderTest = new CigarParty();
        assertEquals(true, systemUnderTest.cigarParty(70, true));
    }
}