package improveAlgo.DynamicProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result= new ArrayList<>();
        int[] dp = new int[nums.length];
        int[] dp2= new int[nums.length];
        Arrays.fill(dp2, -1);
        Arrays.fill(dp, 1);
        int index=0;
        int max=0;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]% nums[j]==0)
                {
                    dp[i]= Math.max(dp[i], dp[j]+1);
                    if(dp[i]>max){
                        max= dp[i];
                        index=i;
                    }
                    if(dp[i]==dp[j]+1) dp2[i]= j;
                }
            }
        }
        do {
            result.add(nums[index]);
            index= dp2[index];
        }
        while (index>=0);
        return result;

    }
}
