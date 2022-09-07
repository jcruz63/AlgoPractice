package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSubArraysWithEqualSumsTest {

    @Test
    void findSubarrays() {
        int[] test1_true = new int[] {4, 2, 4};
        int[] test2_false = new int[] {1, 2, 3, 4, 5};
        int[] test3_true = new int[] {0, 0};


        assertTrue(FindSubArraysWithEqualSums.findSubarrays(test1_true));
        assertFalse(FindSubArraysWithEqualSums.findSubarrays(test2_false));
        assertTrue(FindSubArraysWithEqualSums.findSubarrays(test3_true));
    }
}