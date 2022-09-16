package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DijkstraAlgoTest {

    @Test
    void dijkstrasAlgorithm() {



        int start = 0;
        int[][][] adjacencyList = new int[][][]{
                {
                        {1,7}
                },
                {
                        {2, 6},
                        {3, 20},
                        {4, 3},
                },
                {
                        {3, 14}
                },
                {
                        {4, 2}
                },
                {},
                {}
        } ;


        int[] expected = new int[]{0, 7, 13, 27, 10, -1};

        assertArrayEquals(expected, DijkstraAlgo.dijkstrasAlgorithm(start, adjacencyList));
    }
}