package improveAlgo.MostWaterContainer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] nums= new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
    public static int maxArea(int[] height) {
        int start= 0;
        int end= height.length-1;
        int water= 0;
        while(start<end){
            water= Math.max(water, (end-start) * Math.min(height[start], height[end]));
            if(height[start]> height[end]) end--;
            else start++;

        }
        return water;
    }
}
