package improveAlgo.SmallestInLexicographicalOrder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println(findKthNumber(100,10));
    }
    public static int findKthNumber(int n, int k) {
        int curr = 1;  // Start from the prefix 1
        k--;  // We start counting from 1, so decrement k

        while (k > 0) {
            int steps = findNumbersWithPrefix(curr, n);
            if (steps <= k) {
                curr++;  // Move to the next prefix
                k -= steps;
            } else {
                curr *= 10;  // Dive deeper into the current prefix
                k--;
            }
        }

        return curr;

    }
    public static int findNumbersWithPrefix(int prefix, int n){
        int result=0;
        int start= prefix, end= prefix;
        while(start<=n){
            result+= Math.min(n+1, end+1)-start;
            start*=10;
            end= end*10+9;
        }
        return result;
    }
}
