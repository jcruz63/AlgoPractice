package challenges.arrays;

public class InPlaceReversal {

    public static int[] reverse(int[] arr){
        for (int i = 0, j = arr.length - 1; i != j; i++, j--){
            int hold = arr[j];
            arr[j] = arr[i];
            arr[i] = hold;
        }
        return arr;
    }

}
