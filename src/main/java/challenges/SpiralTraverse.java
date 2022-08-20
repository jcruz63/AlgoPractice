package challenges;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

//    int[][] array = new int[][]{
//            {1, 2, 3, 4},
//            {12, 13, 14, 5},
//            {11, 16, 15, 6},
//            {10, 9, 8, 7}
//    };
//int[][] test2 = new int[][]{
//        {1,2,3,4},
//        {10,11,12,5},
//        {9,8,7,6}
//};


    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        List<Integer> solution = new ArrayList<>();

        //traverse top frame
        int startColumn = 0;
        int startRow = 0;
        int endColumn = array[startRow].length - 1;
        int endRow = array.length - 1;

        System.out.printf("SC: %s, EC: %s, SR: %s, ER: %s\n", startColumn, endColumn, startRow, endRow);


        while (startColumn <= endColumn && startRow <= endRow){
            //top frame
            for(int i = startColumn; i <= endColumn; i++){
                solution.add(array[startRow][i]);
            }
            if(array.length == 1){
                break;
            }
            System.out.printf("Top frame: %s\n", solution);
            System.out.printf("SC: %s, EC: %s, SR: %s, ER: %s\n", startColumn, endColumn, startRow, endRow);
            if(array.length % 3 == 0 && startRow == endRow){
                break;
            }

            //back frame
            for(int i = startRow + 1; i <= endRow; i++){
                solution.add(array[i][endColumn]);
            }
            System.out.printf("back frame: %s\n", solution);


            //bottom frame
            for(int i = endColumn - 1; i >= startColumn; i--){

                solution.add(array[endRow][i]);
            }

            System.out.printf("bottom frame: %s\n", solution);

            endColumn--;
            if(startColumn > endColumn){
                break;
            }
            //front frame
            for (int i = endRow - 1; i > startRow; i--){
                solution.add(array[i][startColumn]);
            }
            System.out.printf("SC: %s, EC: %s, SR: %s, ER: %s\n", startColumn, endColumn, startRow, endRow);
            System.out.println(solution);
            System.out.println("____________");
            startColumn++;

            startRow++;
            endRow--;


        }
        System.out.println(solution);
        return solution;
    }

}
