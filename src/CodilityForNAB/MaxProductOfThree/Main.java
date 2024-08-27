package CodilityForNAB.MaxProductOfThree;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
    }
    public int solution(int[] A) {
        // Implement your solution here
        Arrays.sort(A);
        int max_1= A[A.length-3]*A[A.length-2]*A[A.length-1];
        int max_2= A[0]* A[1]* A[A.length-1];
        return Math.max(max_2,max_1);
    }
}
