package challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverseString() {
        String t1 = "";
        String t2 = "a";
        String t3 = "olleh";

        assertEquals(t1,
                ReverseString.reverseString(""));
        assertEquals(t2,
                ReverseString.reverseString("a"));
        assertEquals(t3,
                ReverseString.reverseString("hello"));
    }
}