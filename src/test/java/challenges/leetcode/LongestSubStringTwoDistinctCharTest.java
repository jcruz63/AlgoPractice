package challenges.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStringTwoDistinctCharTest {

    @Test
    void lengthOfLongestSubstringTwoDistinct() {
        String test1 = "ccaabbb";
        assertEquals(5, LongestSubStringTwoDistinctChar.lengthOfLongestSubstringTwoDistinct(test1));

        String test2 = "a";
        assertEquals(1, LongestSubStringTwoDistinctChar.lengthOfLongestSubstringTwoDistinct(test2));

        String test3 = "aa";
        assertEquals(2, LongestSubStringTwoDistinctChar.lengthOfLongestSubstringTwoDistinct(test3));

        String test4 = "aac";
        assertEquals(3, LongestSubStringTwoDistinctChar.lengthOfLongestSubstringTwoDistinct(test4));

        String test5 = "eceba";
        assertEquals(3, LongestSubStringTwoDistinctChar.lengthOfLongestSubstringTwoDistinct(test5));

        String test6 = "eceebbba";
        assertEquals(5, LongestSubStringTwoDistinctChar.lengthOfLongestSubstringTwoDistinct(test6));
    }
}