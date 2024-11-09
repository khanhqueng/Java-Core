package improveAlgo.greedy;

import java.util.Arrays;

public class MinimumIncrementForUnique {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        int prev= nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=prev){
                result+=prev+1-nums[i];
                nums[i]=prev+1;
            }
            prev= nums[i];
        }
        return result;
    }
}
