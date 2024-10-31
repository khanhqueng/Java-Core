package improveAlgo.greedy;

import java.util.Arrays;

public class ValidTriagleNumber {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        for(int i=nums.length-1;i>=2;i-- ){
            int left=0, right= i-1;
            while(left<right){
                if(nums[left]+nums[right]> nums[i]){
                    res+=left-right;
                    right--;
                }
                else left++;
            }
        }
        return res;
    }
}
