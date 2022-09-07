package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourNumberSumTest {

    @Test
    void test1() {
        int[] test = new int[]{7, 6, 4, -1, 1, 2};
        int targetSum = 16;
        int[][] expected = new int[][]{
                {7, 6, 4, -1},
                {7, 6, 1, 2}
        };

        assertArrayEquals(expected, FourNumberSum.fourNumberSum(test, targetSum).toArray());
    }
}