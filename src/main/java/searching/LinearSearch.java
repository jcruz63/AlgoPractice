package searching;

public class LinearSearch {

    public int findIter(int[] container, int item){

        for (int i = 0; i <container.length; i++){
            if(container[i] == item){
                return i;
            }
        }
        return -1;
    }

    public int findRecur(int[] container, int item, int index){

        if(index >= container.length){
            return -1;
        }

        if(container[index] == item){
            return index;
        }


        return findRecur(container, item, ++index);
    }
}
