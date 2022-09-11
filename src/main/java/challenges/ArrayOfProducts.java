package challenges;

import java.util.List;

public class ArrayOfProducts {


//failed approach
//    public static int[] arrayOfProducts(int[] array) {
//        int[] solution = new int[array.length];
//        int rollingSum = 1;
//        for(int i = 0; i < array.length; i++){
//            if(array[i] != 0){
//                rollingSum = rollingSum * array[i];
//            }
//        }
//        for(int i = 0; i < array.length; i++){
//            if(array[i] == 0){
//                solution[i] = rollingSum;
//            }else{
//                solution[i] = rollingSum / array[i];
//            }
//
//        }
//
//        return solution;
//    }

    public static int[] recrusiveProduct(int[] array, int currentPos, int[] solution){

        if(currentPos > array.length - 1){
            return solution;
        }

        //swap
        int temp = array[0];
        array[0] = array[currentPos];
        array[currentPos] = temp;

        int rollingProduct = 1;
        for (int i = 1; i <array.length; i++){
            rollingProduct = rollingProduct * array[i];
        }

        solution[currentPos] = rollingProduct;

        return recrusiveProduct(array, ++currentPos, solution);
    }

    public static int[] arrayOfProducts(int[] array) {
        return recrusiveProduct(array, 0, new int[array.length]);
    }
}
