package recursion;

public class Euclidean {

    public int GCD(int a,int  b){
        int remainder = a % b;
        if(remainder == 0){
            return b;
        }

        return GCD(b, remainder);
    }
}
