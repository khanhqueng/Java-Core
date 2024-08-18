package improveAlgo.TwoSumII;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        int[] nums = new int[]{-10,-8,-2,1,2,5,6};
        System.out.println(Arrays.toString(twoSum(nums, 0)));
    }
    public static int[] twoSum(int[] numbers, int target) {
        int low= 0;
        int high= numbers.length-1;
        while(low<high){
            int sum= numbers[low]+numbers[high];
            if(sum==target) return  new int[]{low+1,high+1};
            else if( sum > target) high--;
            else low++;
        }
        return  null;
    }

}
