package challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RunningSum1dArrayTest {

    @Test
    void runningSum() {
        int[] sample1 = {1,2,3,4};
        int[] expected1 = {1,3,6,10};

        assertArrayEquals(expected1, RunningSum1dArray.runningSum(sample1));
    }
}