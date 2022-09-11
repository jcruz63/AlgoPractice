package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfProductsTest {

    @Test
    void initTest() {
        int[] testarr = new int[]{5, 1, 4, 2};
        int[] solution = new int[]{8, 40, 10, 20};
        assertArrayEquals(solution, ArrayOfProducts.arrayOfProducts(testarr));
    }
}