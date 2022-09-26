package challenges.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DutchNationalFlagTest {

    @Test
    void dutchSort() {

        int[] arrToTest = new int[]{0, 1, 2, 1, 2, 0, 0};
        int[] arrExpected = new int[]{0, 0, 0, 1, 1, 2, 2};

        //Testing that the result is the same array in memory
        assertEquals(arrToTest, DutchNationalFlag.dutchSort(arrToTest));

        assertArrayEquals(arrExpected, DutchNationalFlag.dutchSort(arrToTest));
    }
}