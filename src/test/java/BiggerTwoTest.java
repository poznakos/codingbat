import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BiggerTwoTest {

    @Test
    void biggerTwo_test1() {
        BiggerTwo systemUnderTest = new BiggerTwo();
        int[] a = new int[]{1,2};
        int[] b = new int[]{3,4};
        int[] expected = new int[]{3,4};
        assertArrayEquals(expected, systemUnderTest.biggerTwo(a,b));
    }
    @Test
    void biggerTwo_test2() {
        BiggerTwo systemUnderTest = new BiggerTwo();
        int[] a = new int[]{3,4};
        int[] b = new int[]{1,2};
        int[] expected = new int[]{3,4};
        assertArrayEquals(expected, systemUnderTest.biggerTwo(a,b));
    }
    @Test
    void biggerTwo_test3() {
        BiggerTwo systemUnderTest = new BiggerTwo();
        int[] a = new int[]{1,1};
        int[] b = new int[]{1,2};
        int[] expected = new int[]{1,2};
        assertArrayEquals(expected, systemUnderTest.biggerTwo(a,b));
    }
    @Test
    void biggerTwo_test4() {
        BiggerTwo systemUnderTest = new BiggerTwo();
        int[] a = new int[]{1,3};
        int[] b = new int[]{2,2};
        int[] expected = new int[]{1,3};
        assertArrayEquals(expected, systemUnderTest.biggerTwo(a,b));
    }
}