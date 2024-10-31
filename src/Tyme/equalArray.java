package Tyme;

import java.math.BigDecimal;
import java.util.Arrays;

public class equalArray {
    public static void main(String[] args) {
        BigDecimal num1= BigDecimal.ONE;
        System.out.println(num1);
        System.out.println(isEqual(new int[]{1,2,5,4,0,0}, new int[]{2,4,5,0,1}));
    }
    public static boolean isEqual(int[] arr1, int[] arr2){
        if(arr1.length!= arr2.length) return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);


    }
}
