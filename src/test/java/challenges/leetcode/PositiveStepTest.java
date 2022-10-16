package challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositiveStepTest {

    @Test
    void minStartValue() {
        int[] test = {-3,2,-3,4,2};
        assertEquals(5, PositiveStep.minStartValue(test));
    }
}