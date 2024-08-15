package improveAlgo.ProductOfArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] nums= new int[] {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] result= new int[n];
        for(int i=0, left= 1; i<n;i++){
            result[i]= left;
            left*= nums[i];
        }
        for(int i=n-1,right=1;i>-0;i--){
            result[i]*= right;
            right*= nums[i];
        }
        return result;
    }
}
