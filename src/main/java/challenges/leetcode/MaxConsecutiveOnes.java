package challenges.leetcode;

public class MaxConsecutiveOnes {
    public static int longestOnes(int[] nums, int k) {
        int output = 0;
        int left = 0;
        int numFlips = 0;

        //non fixed sliding window
        for (int right = 0; right < nums.length; right++) {
            if(nums[right] == 0){
                numFlips++;
            }
            if(numFlips > k) {
                while (left < right && numFlips > k){
                    if(nums[left] == 0){
                       numFlips--;
                    }
                    left++;
                }
            } else {
                output = Math.max(output, right - left + 1);
            }
        }

        return output;
    }
}
