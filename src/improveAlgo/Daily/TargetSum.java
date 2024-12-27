package improveAlgo.Daily;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int sumOfNums = 0;
        int zeroCount = 0;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                sumOfNums += num;
            }
        }
        if ((sumOfNums + target) % 2 != 0 || sumOfNums < Math.abs(target)) {
            return 0;
        }
        int subsetSum = (sumOfNums + target) / 2;
        int[] dp = new int[subsetSum + 1];
        // base case
        dp[0] = 1;
        for(int num: nums){
            if(num>0){
                for(int i=subsetSum;i>=num;i--){
                    dp[i]= dp[i-num];
                }
            }
        }
        return dp[subsetSum] * (1 << zeroCount);
    }
}
