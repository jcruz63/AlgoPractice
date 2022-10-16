package challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    @Test
    void longestOnes() {

        int[] sample = {1,1,1,0,0,0,1,1,1,1,0};
        int flips = 2;

        assertEquals(6, MaxConsecutiveOnes.longestOnes(sample, flips));

        int[] sample2 = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int flips2 = 3;

        assertEquals(10, MaxConsecutiveOnes.longestOnes(sample2, flips2));

    }
}