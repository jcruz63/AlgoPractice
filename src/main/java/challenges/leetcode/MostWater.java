package challenges.leetcode;

public class MostWater {
    public static int maxArea(int[] height) {
        int maxWater = 0;

        for(int left = 0, right = height.length - 1; left < right;){
            int distance = right - left;
            int currentMaxHeight = Math.min(height[left], height[right]);
            int volume = currentMaxHeight * distance;
            if(volume > maxWater){
                maxWater = volume;
            }

            if(height[left] < height[right]){
                left++;
            } else if (height[left] > height[right]){
                right--;
            }else {
                left++;
            }
        }
        return maxWater;
    }
}
