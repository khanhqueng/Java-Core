package improveAlgo.greedy;

public class IntegerReplacement {
    public int integerReplacement(int n) {
        long result=0;
        if(n==3) return 2;
        while( n!=1){
            if(n==3) {
                result+=2;
                break;
            }
            if(n%2==0) {
                n /= 2;
            }
            else if(n%4==1) n=n-1;
            else if (n%4==3) n=n+1;
            result++;
        }
        return (int) result;
    }
}
