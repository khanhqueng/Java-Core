package improveAlgo.DynamicProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class KnapSackVariant {
    public static void main(String[] args) {

        System.out.println(unboundedKnapsack(9, Arrays.asList(2, 4, 4,4, 8)));

    }
    public static int unboundedKnapsack(int k, List<Integer> arr) {
        // Write your code here
        int[][] dp= new int[arr.size()+1][k+1];
        for(int i=1;i<=arr.size();i++){
            for(int j=1;j<=k;j++){
                dp[i][j]= dp[i-1][j];
                if(j>=arr.get(i-1)){
                    dp[i][j]= Math.max(dp[i][j], dp[i][j-arr.get(i-1)]+arr.get(i-1));
                }
                if(dp[i][j]==k) return k;
            }
        }
        return dp[arr.size()][k];
    }
}
