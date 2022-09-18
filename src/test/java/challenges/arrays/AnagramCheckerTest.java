package challenges.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void anagram() {

        String toTest = "restful";
        String toTest2 = "fluster";

        assertTrue(AnagramChecker.anagram(toTest, toTest2));

    }
}