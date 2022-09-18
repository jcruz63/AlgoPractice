package challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeOverlappingIntervalsTest {

    @Test
    void test1() {
        int[][] test = new int[][]{
                {1, 2},
                {3, 5},
                {4, 7},
                {6, 8},
                {9, 10}
        };

        int[][] solution = new int[][]{
                {1, 2}, {3, 8}, {9, 10}};

        MergeOverlappingIntervals mergeOverlappingIntervals = new MergeOverlappingIntervals();
        int[][] mergedIntervals = mergeOverlappingIntervals.mergeOverlappingIntervals(test);

        assertArrayEquals(solution, mergedIntervals);

    }
}