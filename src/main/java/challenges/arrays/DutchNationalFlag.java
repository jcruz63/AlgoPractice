package challenges.arrays;

public class DutchNationalFlag {

    public static int[] dutchSort(int arr[]){

        int i = 0, j = 0, k = arr.length - 1;

        while (j < k){

            //compare j with middle value 1
            if(arr[j] < 1) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                i++;
            } else if (arr[j] > 1) {
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k--;
            }
            else {
                j++;
            }

        }

        return arr;
    }
}
