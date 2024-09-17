package improveAlgo.ThreeSum;

import java.util.*;

public class Main {
    public static void main(String[] args){
        int[] nums= new int[] {-2,0,1,1,2};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result= new ArrayList<>();
        Set<String> checkDuplicate= new HashSet<>();
        for(int i=0;i< nums.length-2 && nums[i]<=0;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum= nums[i]+nums[j]+nums[k];
                if(sum<0) j++;
                if(sum>0) k--;
                if(sum==0){
                    String toString= nums[i]+ " "+ nums[j]+" "+ nums[k];
                    if(!checkDuplicate.contains(toString)){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        checkDuplicate.add(toString);
                    }
                    j++;
                    k--;


                }

            }
        }
        return result;
    }
}
