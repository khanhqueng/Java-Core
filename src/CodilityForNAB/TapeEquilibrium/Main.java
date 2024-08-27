package CodilityForNAB.TapeEquilibrium;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
    }
    public int solution(int[] A) {
        // Implement your solution here
        int sum= IntStream.of(A).sum();
        int sum1=0;
        int sum2=0;
        int min_diff= Integer.MAX_VALUE;
        for(int i=1;i<A.length;i++){
            sum1+=A[i-1];
            sum2= sum-sum1;
            int diff= Math.abs(sum1-sum2);
            min_diff=Math.min(min_diff,diff);
        }
        return min_diff;


    }
}
