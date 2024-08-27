package CodilityForNAB.Triagle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }
    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        for(int i=A.length-1;i>=2;i--){
            if(A[i]<A[i-1]+A[i-2]) return 1;
        }
        return 0;
    }
}
