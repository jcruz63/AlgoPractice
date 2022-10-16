package challenges.leetcode;

public class PositiveStep {

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            runningSum[i] = currentSum;
        }
        return runningSum;
    }

    public static int minStartValue(int[] nums) {
        int[] sums = runningSum(nums);
        int mostNeg = 0;
        for (int sum : sums) {
            mostNeg = Math.min(mostNeg,
                    sum);
        }
        return Math.abs(mostNeg) + 1;
    }
}
