import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Or35Test {

    @Test
    void or35_is_the_dividing_by_5() {
        Or35 systemUnderTest = new Or35();
        assertEquals( true, systemUnderTest.or35(5));
    }
    @Test
    void or35_is_the_dividing_by_3() {
        Or35 systemUnderTest = new Or35();
        assertEquals( true, systemUnderTest.or35(3));
    }
}