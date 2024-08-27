package CodilityForNAB.Permissing;

import java.lang.reflect.Array;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

    }
    public int solution(int[] A) {
        // Implement your solution here
        long sum= IntStream.of(A).sum();
        long sumAll= (long) (A.length + 1 + 1) * (A.length+1)/2;
        return (int) ((int)sumAll-sum);
    }
}
