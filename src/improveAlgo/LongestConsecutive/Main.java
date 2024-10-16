package improveAlgo.LongestConsecutive;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        int count=1;
        for(int i=0;i< nums.length-1;i++){
            if (nums[i]==nums[i+1]) {
                continue;
            }
            if(nums[i]+1==nums[i+1]) count++;
            else {
                result = Math.max(result, count);
                count=1;
            }
        }
        result = Math.max(result, count);
        return result;
    }
}
