package challenges.leetcode;

public class RunningSum1dArray {
    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            runningSum[i] = currentSum;
        }
        return runningSum;
    }
}
