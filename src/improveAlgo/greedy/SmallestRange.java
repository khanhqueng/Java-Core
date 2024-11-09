package improveAlgo.greedy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SmallestRange {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int min, max= Integer.MIN_VALUE, firstMax, firstMin;
        int result= Integer.MAX_VALUE;
        int diff= nums[nums.length-1]-nums[0];
        firstMin= nums[0]+k;
        firstMax= nums[nums.length-1]-k;
        for(int i=1;i<nums.length;i++){
            int currMin= nums[i]-k;
            int currMax= nums[i-1]+k;
            min= Math.min(currMin, firstMin);
            max= Math.max(currMax,firstMax);
            result= Math.min(result, max-min);
        }
        return Math.min(result,diff);

    }
}
