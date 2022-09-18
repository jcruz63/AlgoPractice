package challenges.arrays;

public class PalindromeChecker {

    public static boolean check(String toCheck){

        for(int leftPointer = 0, rightPointer = toCheck.length() - 1; leftPointer < rightPointer; leftPointer++,
                rightPointer--){
            if(toCheck.charAt(leftPointer) != toCheck.charAt(rightPointer)){
                return false;
            }
        }

        return true;
    }
}
