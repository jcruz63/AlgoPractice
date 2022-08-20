package recursion;

public class Fib {

    public int head(int n){

        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        int fib1 = head(n - 1);
        int fib2 = head(n - 2);
        return fib1 + fib2;
    }

    public int tail(int n, int fib1, int fib2){
        if(n==0){
            return fib1;
        }
        if(n==1){
            return fib2;
        }

        return tail(n - 1, fib2 , fib1 + fib2);
    }
}
