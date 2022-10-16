package challenges.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringTwoDistinctChar {
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        Set<Character> distinct = new HashSet<>();
        int longestLength = 0;
        for (int right = 0, left = 0; right < s.length(); right++) {
            if(distinct.size() < 2){
                distinct.add(s.charAt(right));
                longestLength = Math.max(longestLength, right - left + 1);
            } else if (!distinct.contains(s.charAt(right))){
                distinct.clear();
                distinct.add(s.charAt(right));
                distinct.add(s.charAt(right - 1));
                left = right - 1;
                while (distinct.contains(s.charAt(left - 1))){
                    left--;
                }
                longestLength = Math.max(longestLength, right - left + 1);
            } else {
                longestLength = Math.max(longestLength, right - left + 1);
            }
        }

        return longestLength;
    }
}
