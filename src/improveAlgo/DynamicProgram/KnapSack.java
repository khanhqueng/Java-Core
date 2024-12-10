package improveAlgo.DynamicProgram;

import java.util.Arrays;

public class KnapSack {
    public static void main(String[] args) {

        System.out.println(knapsack(new int[]{2,1,4,3}, new int[]{3,3,4,2}, 6));

    }
    public static int knapsack(int[] weight, int[] value, int max) {
        int[][] dp = new int[value.length+1][max+1];
        for(int i=1;i<=weight.length;i++){
            for(int j=1;j<=max;j++){
                dp[i][j]= dp[i-1][j];
                if(j>=weight[i-1]){
                    dp[i][j]= Math.max(dp[i][j], dp[i-1][j-weight[i-1]]+value[i-1]);
                }
            }
        }
        return dp[value.length][max];
    }
}
