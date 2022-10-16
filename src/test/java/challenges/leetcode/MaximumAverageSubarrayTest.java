package challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAverageSubarrayTest {

    @Test
    void findMaxAverage() {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double solution = 12.75000;

        assertEquals(solution, MaximumAverageSubarray.findMaxAverage(nums, k));

        int[] nums2 = {-1};

        assertEquals(-1, MaximumAverageSubarray.findMaxAverage(nums2, 1));
    }
}