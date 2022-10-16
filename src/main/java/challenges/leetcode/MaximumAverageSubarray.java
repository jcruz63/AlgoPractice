package challenges.leetcode;

public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        //fixed sliding window first pass
        double current = 0;
        for (int i = 0; i < k; i++) {
            current += nums[i];
        }

        double solution = current / k;

        for (int i = k; i < nums.length; i++) {
            current += nums[i] - nums[i - k];
            solution = Math.max(solution, current/k);
        }


        return solution;
    }
}
