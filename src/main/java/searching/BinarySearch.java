package searching;

public class BinarySearch {

    public int find(int[] container, int item, int left, int right){

        if(right < left){
            return -1;
        }

        int middleIndex = (left + right) / 2;

        if(container[middleIndex] == item){
            return middleIndex;
        }

        if(container[middleIndex] < item){
            left = middleIndex + 1;
        }
        else {
            right = middleIndex - 1;

        }

        return find(container, item, left, right);
    }
}
