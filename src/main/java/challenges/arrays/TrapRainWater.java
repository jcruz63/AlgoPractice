package challenges.arrays;

public class TrapRainWater {

    public static int amountOfRainWaterTrapped(int[] elevationMap){

        int[] maxLeft = new int[elevationMap.length];
        int[] maxRight = new int[elevationMap.length];
        int amountOfWater = 0;

        if(elevationMap.length < 3){
            return amountOfWater;
        }

        maxLeft[0] = 0;

        for(int i = 1; i < maxLeft.length; i++){
            maxLeft[i] = Math.max(maxLeft[i - 1], elevationMap[i - 1]);
        }

        maxRight[maxRight.length -1] = 0;

        for(int k = maxRight.length - 2; k > -1; k--){
            maxRight[k] = Math.max(maxRight[k + 1], elevationMap[k + 1]);
        }

        for(int j = 0; j < elevationMap.length; j++){

            int amount = Math.min(maxLeft[j], maxRight[j]) - elevationMap[j];
//            System.out.println("left: " + maxLeft[j] + " right: " + maxRight[j] + " current elevation: " + elevationMap[j] + " amount: " + amount);
            if(amount > 0){
                amountOfWater += amount;
            }
        }



        return amountOfWater;
    }
}
