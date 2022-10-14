package challenges.leetcode;

public class ReverseString {


    public static String reverseString(String toReverse){
        if(toReverse.equals("") || toReverse.length() == 1){
            return toReverse;
        }
        char[] chars = toReverse.toCharArray();

        for(int left = 0, right = chars.length - 1; left < right; left++, right--){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
        }

        return new String(chars);
    }
}
