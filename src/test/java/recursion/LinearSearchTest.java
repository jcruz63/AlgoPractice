package recursion;

import org.junit.jupiter.api.Test;
import searching.LinearSearch;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    private final LinearSearch linearSearch = new LinearSearch();
    private final int[] testArr = new int[]{
      10, 5, -1, 9
    };
    @Test
    void findIter() {
        assertEquals(1, linearSearch.findIter(testArr, 5));
    }

    @Test
    void findRecur() {
        assertEquals(1, linearSearch.findRecur(testArr, 5, 0));
    }
}