import challenges.leetcode.RunningSum1dArray;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] test = {-3,2,-3,4,2};
        int[] result = RunningSum1dArray.runningSum(test);
        System.out.println(Arrays.toString(result));

    }
}
