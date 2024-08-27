package CodilityForNAB.MaxCounters;

import java.util.Arrays;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
    }
    public static int[] solution(int N, int[] A) {
        // Implement your solution here
        int[] result =new int[N];
        int max=0;
        int min=0;
        for(int i=0;i<A.length;i++){
            if(A[i]!=N+1){
                if(result[A[i]-1]<min) result[A[i]-1]=min;

                result[A[i]-1]++;
                if(result[A[i]-1]>max) max = result[A[i]-1];
            }
            else{
                min=max;
            }
        }
        for(int i=0;i<result.length;i++){
            if(result[i]<min) result[i]=min;
        }
        return result;
    }
}
