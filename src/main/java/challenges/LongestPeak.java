package challenges;

import java.util.ArrayList;
import java.util.List;

public class LongestPeak {

    //Failed initial approach
//    private static int findPeak(int[] arr,int previousValue, int currentPosition,  int longestPeak, boolean directionChange, int currentLength){
//
//        if(currentPosition >= arr.length){
//            return longestPeak;
//        }
//        if(arr[currentPosition] < previousValue || arr[currentPosition] == previousValue){
//            if(!directionChange){
//                directionChange = true;
//                currentLength++;
//            }
//            else {
//                currentLength++;
//            }
//        }
//        else {
//            if(directionChange){
//                longestPeak = currentLength;
//                currentLength = 1;
//                directionChange = false;
//            }
//            else {
//                currentLength++;
//            }
//        }
//        System.out.printf("PV: %d, CV: %d, longest: %d, direction: %s, current length: %d\n________________\n", previousValue, arr[currentPosition], longestPeak, directionChange, currentLength);
//        return findPeak(arr, arr[currentPosition], ++currentPosition, longestPeak, directionChange, currentLength);
//    }


    public static int findLengthOfPeak(int[] arr, int peakPosition){
        int length = 1;
        int leftIter = peakPosition - 1;
        int rightIter = peakPosition + 1;
        while (leftIter >= 0){
            if(arr[leftIter] < arr[leftIter + 1]){
                length++;
            }
            else {
                break;
            }
            leftIter--;
        }
        while (rightIter < arr.length){
            if(arr[rightIter] < arr[rightIter - 1]){
                length++;
            }
            else {
                break;
            }
            rightIter++;
        }
        return length;
    }

    public static List<Integer> findPeaks(int[] arr, List<Integer> peaks, int position){
        if(position == arr.length - 1){
            return peaks;
        }

        if(arr[position - 1] < arr[position] && arr[position + 1] < arr[position]){
            peaks.add(position);
        }

        return findPeaks(arr, peaks, ++position);
    }

    public static int longestPeak(int[] array) {
        if(array.length < 3){
            return 0;
        }
        int longestPeak = 0;
        Integer[] peaks = findPeaks(array, new ArrayList<>(), 1).toArray(new Integer[0]);
        for(int elem: peaks){
            int length = findLengthOfPeak(array, elem);
            System.out.println(length);
            if(longestPeak < length){
                longestPeak = length;
            }
        }

        return longestPeak;
    }
}
