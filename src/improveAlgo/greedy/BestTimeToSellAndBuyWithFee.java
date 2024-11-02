package improveAlgo.greedy;

public class BestTimeToSellAndBuyWithFee {
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length+1][2];
        for(int i=prices.length-1;i>=0;i--){
            for(int j=0;j<2;j++){
                if(j==0){
                    dp[i][j]=Math.max(prices[i]+ dp[i+1][1], dp[i+1][0]);
                }
                else {
                    dp[i][j]= Math.max(dp[i+1][0]-prices[i]-fee, dp[i+1][1]);
                }
            }
        }
        return dp[0][1];

    }
}
