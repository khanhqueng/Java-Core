package improveAlgo.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CanSortArray {
    public static void main(String[] args){
        System.out.println(canSortArray(new int[]{20, 6, 7, 10, 20, 6, 20}));
    }
    public static boolean canSortArray(int[] nums) {
        Map<Integer,Integer> map =new HashMap<>();
        for(int i : nums){
            String binary= Integer.toBinaryString(i);
            int count=0;
            for (int j=0;j<binary.length();j++){
                if(binary.charAt(j)=='1') count++;
            }
            map.put(i, count);
        }
        int[] sorted= Arrays.stream(nums).sorted().toArray();
        for(int i =0;i<nums.length;i++){
            if(i==0 && nums[i]!= sorted[i] && (map.get(nums[i])!= map.get(nums[i+1]))) return false;
            else if(i==nums.length-1 && nums[i]!= sorted[i] && (map.get(nums[i])!= map.get(nums[i-1]))) return false;
            else if(i>0 && i<nums.length-1 && nums[i]!= sorted[i] && (map.get(nums[i])!= map.get(nums[i+1])) && (map.get(nums[i])!= map.get(nums[i-1]))) return false;
            else if(!Objects.equals(map.get(nums[i]), map.get(sorted[i]))) return false;
        }
        return true;
    }
}
