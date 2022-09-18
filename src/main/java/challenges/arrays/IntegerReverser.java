package challenges.arrays;

public class IntegerReverser {

    public static int reverse(int toReverse){
        return Integer.parseInt(String.valueOf(new StringBuilder(String.valueOf(toReverse)).reverse()));
    }
}
