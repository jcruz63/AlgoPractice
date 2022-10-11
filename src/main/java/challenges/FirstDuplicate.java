package challenges;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {

    public int firstDuplicateValue(int[] array) {
        Set<Integer> visitedValues = new HashSet<>();

        for(int elem: array){
            if(visitedValues.contains(elem)){
                return elem;
            }else {
                visitedValues.add(elem);
            }
        }

        return -1;
    }
}
