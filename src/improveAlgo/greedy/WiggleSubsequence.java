package improveAlgo.greedy;

import java.util.HashSet;
import java.util.Set;

public class WiggleSubsequence {
    public static void main(String[] args){
        System.out.println(wiggleMaxLength(new int[]{1,7,4,9,2,5}));

    }
    public static int wiggleMaxLength(int[] nums) {
        char signal = 0;
        int result= nums.length;
        if (nums.length<=2){
            Set<Integer> set= new HashSet<>();
            for(int num: nums) set.add(num);
            return set.size();
        }
        int startIndex=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]) {
                signal = '+';
                startIndex=i;
                break;
            }
            else if (nums[i]<nums[i+1]) {
                signal='-';
                startIndex=i;
                break;
            }
            else result--;
        }
        for(int i=startIndex;i< nums.length-1;i++){
            if(signal=='+'){
                if(nums[i]>nums[i+1]){
                    signal='-';
                    continue;
                }
                else {
                    result--;
                    continue;
                }
            }
            if(nums[i]<nums[i+1]){
                signal='+';
            }
            else {
                result--;
            }
        }
        return result;
    }
}
