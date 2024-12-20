package improveAlgo.DynamicProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfLIS {

    public int findNumberOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int[] count= new int[nums.length];
        Arrays.fill(dp,1);
        Arrays.fill(count,1);
        for(int i=1;i<nums.length;i++)
            for (int j=0;j<i;j++){
                if(nums[i]>nums[j] && dp[j]+1>dp[i]){
                    dp[i]=dp[j]+1;
                    count[i]=count[j];
                }
                else if(nums[i]>nums[j] && dp[j]+1==dp[i]){
                    count[i]+=count[j];
                }
            }
        int max = Arrays.stream(dp).max().getAsInt();
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(dp[i]==max) result+=count[i];
        }
        return result;
    }
}
