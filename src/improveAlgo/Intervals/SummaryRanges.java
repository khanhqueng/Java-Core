package improveAlgo.Intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        if(nums.length==0) return new ArrayList<>();
        int start=nums[0];
        int end= 0;
        List<String> result= new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1!=nums[i+1]){
                if(start==nums[i]) {
                    result.add(String.valueOf(start));
                    start=nums[i+1];
                    continue;
                }
                end = nums[i];
                result.add(start+"->"+end);
                start=nums[i+1];
            }

        }
        if(start!= nums[nums.length-1]) result.add(start+"->"+nums[nums.length-1]);
        else result.add(String.valueOf(nums[nums.length-1]));
        return result;
    }
}
