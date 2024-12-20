package improveAlgo.Daily;

import java.util.*;

public class ContinousSubarray {
    public long continuousSubarrays(int[] nums) {
        int result=0;
        int left=0;
        Deque<Integer> min= new LinkedList<>();
        Deque<Integer> max= new LinkedList<>();
        for(int right=0;right<nums.length;right++){
            while(!min.isEmpty() && nums[right]<nums[min.peekLast()]){
                min.pollLast();
            }
            while(!max.isEmpty() && nums[right]>=nums[max.peekLast()]){
                max.pollLast();
            }
            max.add(right);
            min.add(right);
            while(nums[max.peekFirst()]-nums[min.peekFirst()]>2){
                left++;
                if(max.peekFirst()<left) max.pollFirst();
                if(min.peekFirst()<left) min.pollFirst();
            }
            result+=right-left+1;

        }

        return result;

    }
}
