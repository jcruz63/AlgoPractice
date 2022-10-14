package challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MostWaterTest {

    @Test
    void maxArea() {
        int[] container = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, MostWater.maxArea(container));
    }
}