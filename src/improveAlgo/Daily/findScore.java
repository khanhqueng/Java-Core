package improveAlgo.Daily;

import java.util.*;

public class findScore {
    public static void main(String[] args) {

        System.out.println(findScore(new int[]{2,1,3,4,5,2}));
    }
    public static long findScore(int[] nums) {
        List<int[]> pair = new ArrayList<>();
        long sum=0;
        for(int i=0;i<nums.length;i++){
            pair.add(new int[]{nums[i], i});
        }
        pair.sort(Comparator.comparingInt(a -> a[0]));
        for(int i=0;i<nums.length;i++){
            int value= pair.get(i)[0];
            int index= pair.get(i)[1];
            if(nums[index]==-1)
                continue;
            nums[index]=-1;
            sum+=value;
            if(index>0){
                nums[index-1]=-1;
            }
            if(index<nums.length-1){
                nums[index+1]=-1;
            }
        }
        return sum;
    }
}
