package improveAlgo.Daily;

import java.util.ArrayList;
import java.util.List;

public class FindPower {
    public int[] resultsArray(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<=nums.length-k;i++){
            boolean isConsecutive= true;
            int j=i;
            for(;j<i+k-1;j++){
                if(nums[j]!=nums[j+1]-1) isConsecutive=false;
            }
            if(!isConsecutive) result.add(-1);
            else result.add(nums[j]);
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}
