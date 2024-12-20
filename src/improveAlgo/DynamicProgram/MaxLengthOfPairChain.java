package improveAlgo.DynamicProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class MaxLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));
        int[] dp = new int[pairs.length];
        Arrays.fill(dp,1);
        for(int i=1;i<pairs.length;i++)
            for (int j=0;j<pairs.length;j++){
                if(pairs[i][0]> pairs[j][1]){
                    dp[i]= Math.max(dp[i],dp[j]+1 );
                }
            }
        return Arrays.stream(dp).max().getAsInt();

    }
}
