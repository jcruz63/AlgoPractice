package challenges.arrays;

import java.util.Arrays;

public class AnagramChecker {

    public static boolean anagram(String one, String two){

        char[] charArray1 = one.toCharArray();
        char[] charArray2 = two.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
