package challenges.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void check() {
        String toCheck = "madam";
        String toCheck2 = "abbbba";
        String toCheck3 = "Hello";

        assertTrue(PalindromeChecker.check(toCheck));
        assertTrue(PalindromeChecker.check(toCheck2));
        assertFalse(PalindromeChecker.check(toCheck3));
    }
}