import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateFashionTest {

    @Test
    void dateFashion_1() {
        DateFashion systemUnderTest = new DateFashion();
        assertEquals(2, systemUnderTest.dateFashion(5, 10));
    }
    @Test
    void dateFashion_2() {
        DateFashion systemUnderTest = new DateFashion();
        assertEquals(0, systemUnderTest.dateFashion(5, 2));
    }
    @Test
    void dateFashion_3() {
        DateFashion systemUnderTest = new DateFashion();
        assertEquals(1, systemUnderTest.dateFashion(5, 5));
    }
}