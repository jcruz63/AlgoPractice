package selection;

import java.util.Random;

public class QuickSelect {
    private int[] nums;

    public QuickSelect(int[] nums) {
        this.nums = nums;
    }

    public int select(int k){
        return quickSelect(0, nums.length - 1, k);
    }

    private int partition(int firstIndex, int lastIndex){
        int pivot = new Random().nextInt(firstIndex - lastIndex+1) + firstIndex;

        swap(pivot, lastIndex);
        return -1;
    }

    private void swap(int pivot, int lastIndex){

    }

    private int quickSelect(int firstIndex, int lastIndex, int k){
        return -1;
    }
}
