package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiralTraverseTest {



    @Test
    void test1() {
        int[][] array = new int[][]{
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };

        Integer [] expected1 = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        assertArrayEquals(expected1, SpiralTraverse.spiralTraverse(array).toArray());

    }

    @Test
    void test2(){
        int[][] test2 = new int[][]{
                {1,2,3,4},
                {10,11,12,5},
                {9,8,7,6}
        };
        Integer[] expected2 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        assertArrayEquals(expected2, SpiralTraverse.spiralTraverse(test2).toArray());
    }

    @Test
    void test12(){
        int[][] test12 = new int[][]{
                {1},
                {3},
                {2},
                {5},
                {4},
                {7},
                {6}
        };
        Integer[] expected12 = new Integer[]{1, 3, 2, 5, 4, 7, 6};
        assertArrayEquals(expected12, SpiralTraverse.spiralTraverse(test12).toArray());
    }

    @Test
    void test11(){
        int[][] test = new int[][]{
                {1, 3, 2, 5, 4, 7, 6}
        };

        Integer[] expected = new Integer[]{1, 3, 2, 5, 4, 7, 6};
        assertArrayEquals(expected, SpiralTraverse.spiralTraverse(test).toArray());
    }
}