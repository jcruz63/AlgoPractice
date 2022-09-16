package challenges.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InPlaceReversalTest {

    @Test
    void reverse() {

        int[] arrayToReverse = new int[]{1,2,3,4,5};
        int[] expectedArray = new int[]{5,4,3,2,1};

        assertArrayEquals(expectedArray, InPlaceReversal.reverse(arrayToReverse));



    }
}