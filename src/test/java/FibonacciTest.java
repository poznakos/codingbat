import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FibonacciTest {

    @Test
    void generateSequence_1() {
        Fibonacci systemUnderTest = new Fibonacci();
        assertEquals(2, systemUnderTest.generateSequence(3));
    }
    @Test
    void generateSequence_2() {
        Fibonacci systemUnderTest = new Fibonacci();
        assertEquals(5, systemUnderTest.generateSequence(5));
    }
    @Test
    void generateSequence_3() {
        Fibonacci systemUnderTest = new Fibonacci();
        assertEquals(1, systemUnderTest.generateSequence(1));
    }
    @Test
    void generateSequence_0() {
        Fibonacci systemUnderTest = new Fibonacci();
        assertEquals(0, systemUnderTest.generateSequence(0));
    }
}