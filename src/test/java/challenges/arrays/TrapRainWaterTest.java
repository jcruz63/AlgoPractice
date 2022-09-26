package challenges.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapRainWaterTest {

    @Test
    void amountOfRainWaterTrapped() {

        int[] arrToTest = new int[]{2, 1, 3, 1, 4};
        assertEquals(3, TrapRainWater.amountOfRainWaterTrapped(arrToTest));

        arrToTest = new int[]{4, 1, 3, 1, 5};
        assertEquals(7, TrapRainWater.amountOfRainWaterTrapped(arrToTest));

        arrToTest = new int[]{1, 0, 2, 1, 3, 1, 2, 0, 3};
        assertEquals(8, TrapRainWater.amountOfRainWaterTrapped(arrToTest));
    }
}