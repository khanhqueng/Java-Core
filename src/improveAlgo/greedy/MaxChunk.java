package improveAlgo.greedy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MaxChunk {
    public int maxChunksToSorted(int[] arr) {
        int[] sorted= Arrays.stream(arr).sorted().toArray();
        Stack<Integer> stack= new Stack<>();
        Set<Integer> missing= new HashSet<>();
        int result=0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            stack.add(arr[i]);
            if(arr[i]!= sorted[i] && missing.isEmpty()){
                for(int j=0;j<arr[i];j++){
                    missing.add(j);
                }
            }
            else if(!missing.contains(arr[i]) && !missing.isEmpty()){
                for(int j=0;j<arr[i];j++){
                    if(!stack.contains(j))
                        missing.add(j);
                }
            } else if (missing.contains(arr[i])) {
                missing.remove(arr[i]);
                if(missing.isEmpty()) result++;
            } else if (arr[i]==sorted[i] && missing.isEmpty()) {
                result++;
            }
        }
        return result;
    }
}
