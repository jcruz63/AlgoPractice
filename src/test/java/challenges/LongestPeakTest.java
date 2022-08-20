package challenges;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LongestPeakTest {

    @Test
    void test1() {
        int[] test = new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};

        assertEquals(6, LongestPeak.longestPeak(test));
    }

    @Test
    void test3(){
        int[] test = new int[]{1, 3, 2};

        assertEquals(3, LongestPeak.longestPeak(test));
    }

    @Test
    void findPeaks() {
        int[] test = new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};
        Integer[] peaks = new Integer[]{4, 6};

        assertArrayEquals(peaks, LongestPeak.findPeaks(test, new ArrayList<>(), 1).toArray());
    }
    @Test
    void findPeaks2() {
        int[] test = new int[]{1, 3, 2};
        Integer[] peaks = new Integer[]{1};

        assertArrayEquals(peaks, LongestPeak.findPeaks(test, new ArrayList<>(), 1).toArray());
    }

    @Test
    void findLengthOfPeak() {
        int[] test = new int[]{1, 2, 3, 3, 4, 0, 10, 6, 5, -1, -3, 2, 3};

        assertEquals(3, LongestPeak.findLengthOfPeak(test, 4));
        assertEquals(6, LongestPeak.findLengthOfPeak(test, 6));
    }
}