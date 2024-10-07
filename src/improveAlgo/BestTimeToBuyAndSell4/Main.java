package improveAlgo.BestTimeToBuyAndSell4;

public class Main {
    public static void main(String[] args) {
        System.out.println(maxProfit(2,new int[]{6,1,3,2,4,7}));
    }
    public static int maxProfit(int k, int[] prices) {
        int[][] dp = new int[k+1][prices.length];
        for(int i=1;i<k+1;i++){
            for(int j=1;j<prices.length;j++){
                for(int z=0;z<j;z++){
                    if(dp[i][j]>dp[i][j-1]){
                        dp[i][j]= Math.max(dp[i][j],dp[i-1][z]+ prices[j]-prices[z]);
                        continue;
                    }
                    dp[i][j]= Math.max(dp[i][j-1],dp[i-1][z]+ prices[j]-prices[z]);
                }
            }
        }
        return dp[k][prices.length-1];
    }
}
