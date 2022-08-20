package recursion;

public class HeadNTails {

    public void tail(int n){
        if(n == 1){
            return;
        }

        System.out.println(n);

        tail(n-1);
    }

    public void head(int n){
        if(n == 1){
            return;
        }

        head(n-1);

        System.out.println(n);
    }
}


