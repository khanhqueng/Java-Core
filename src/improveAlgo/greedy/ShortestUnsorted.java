package improveAlgo.greedy;

import java.util.Arrays;

public class ShortestUnsorted {
    public int findUnsortedSubarray(int[] nums) {
        int[] sortedNums= Arrays.stream(nums).sorted().toArray();
        int start=0;
        int end= nums.length-1;
        int startIndexResult= 0;
        int endIndexResult= -1;
        boolean foundStart= false;
        boolean foundEnd=false;
        for(int i=0,j=nums.length-1;i<nums.length;i++,j--){
            if(nums[i]!=sortedNums[i] && !foundStart){
                startIndexResult=i;
                foundStart=true;
            }
            if(nums[j]!=sortedNums[j] && !foundEnd){
                endIndexResult=j;
                foundEnd=true;
            }
        }
        return startIndexResult-endIndexResult+1;
    }
}
