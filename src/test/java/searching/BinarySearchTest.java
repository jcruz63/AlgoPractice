package searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private BinarySearch binarySearch = new BinarySearch();
    private final int[] testArr = new int[]{
            -1, 5, 9, 10
    };

    @Test
    void find() {
        assertEquals(0, binarySearch.find(testArr, -1, 0, testArr.length - 1));
        assertEquals(1, binarySearch.find(testArr, 5, 0, testArr.length - 1));
        assertEquals(2, binarySearch.find(testArr, 9, 0, testArr.length - 1));
        assertEquals(3, binarySearch.find(testArr, 10, 0, testArr.length - 1));
        assertEquals(-1, binarySearch.find(testArr, 11, 0, testArr.length - 1));
    }
}