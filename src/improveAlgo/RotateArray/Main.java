package improveAlgo.RotateArray;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        int[] nums= new int[]{ 1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
//    public void rotate(int[] nums, int k) {
//        for(int i=1;i<=k;i++){
//            int temp = nums[nums.length-1];
//            for(int j=nums.length-1;j>=1;j--){
//                nums[j]= nums[j-1];
//            }
//            nums[0]=temp;
//        }
//    }
    public static void rotate(int[] nums, int k) {
        if(nums.length<k) {
            for(int i=0;i<nums.length/2;i++){
                int temp = nums[i];
                nums[i] = nums[nums.length-i-1];
                nums[nums.length-i-1] = temp;
            }
        };

       int[] knums= new int[k];
       int h=0;
       for(int j=nums.length-k;j<nums.length;j++){
           knums[h++]= nums[j];
       }
       for(int i= nums.length-k-1;i>=0;i--){
           nums[i+k]=nums[i];
       }
       for(int i=0 ;i<k;i++){
           nums[i]=knums[i];
       }
    }
}
