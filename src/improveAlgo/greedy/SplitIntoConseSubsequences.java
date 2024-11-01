package improveAlgo.greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitIntoConseSubsequences {
    public boolean isPossible(int[] nums) {
        Map<Integer,Integer> frequency= new HashMap<>();
        Map<Integer, Integer> available= new HashMap<>();
        for(int i : nums){
            frequency.put(i, frequency.getOrDefault(i,0)+1);
        }
        for(int i=0;i< nums.length;i++){
            if(frequency.get(nums[i])==0) continue;
            else if( available.get(nums[i])>0){
                frequency.put(nums[i], frequency.getOrDefault(nums[i],0)-1);
                available.put(nums[i], available.getOrDefault(nums[i],0)-1);
                available.put(nums[i]+1, available.getOrDefault(nums[i]+1,0)+1);
            }
            else if(frequency.get(nums[i])>0 && frequency.get(nums[i]+1)>0 && frequency.get(nums[i]+2)>0){
                frequency.put(nums[i], frequency.getOrDefault(nums[i],0)-1);
                frequency.put(nums[i]+1, frequency.getOrDefault(nums[i]+1,0)-1);
                frequency.put(nums[i]+2, frequency.getOrDefault(nums[i]+2,0)-1);

                available.put(nums[i]+3, available.getOrDefault(nums[i]+3,0)+1);
            }
            else return false;
        }
        return true;
    }
}
