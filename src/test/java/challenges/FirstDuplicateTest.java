package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstDuplicateTest {

    @Test
    void firstDuplicateValue() {
        int[] test = new int[]{2, 1, 5, 2, 3, 3, 4};
        FirstDuplicate firstDuplicate = new FirstDuplicate();
        assertEquals(2, firstDuplicate.firstDuplicateValue(test));

    }
}