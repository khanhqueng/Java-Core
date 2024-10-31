package improveAlgo.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MaxLengthPairChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(pair -> pair[0]));
        Stack<int[]> stack = new Stack<>();
        stack.add(pairs[0]);
        for(int i=1;i<pairs.length;i++){
            if(!stack.isEmpty() && pairs[i][0]>= stack.peek()[1]){
                stack.add(pairs[i]);
            }
            else if(pairs[i][0]< stack.peek()[1]){
                if(pairs[i][1]>=stack.peek()[1]) continue;
                else {
                    stack.pop();
                    stack.add(pairs[i]);
                }

            }
        }
        return stack.size();
    }
}
