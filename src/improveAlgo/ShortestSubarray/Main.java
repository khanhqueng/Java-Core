package improveAlgo.ShortestSubarray;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(findLengthOfShortestSubarray(new int[]{13,0,14,7,18,18,18,16,8,15,20}));


    }
    public static int findLengthOfShortestSubarray(int[] arr) {
        int start= 0;
        int end= arr.length-1;
        while(start<arr.length-1 && arr[start]<=arr[start+1]){
            start++;
        }
        while(end>0 && arr[end]>=arr[end-1]){
            end--;
        }
        if(start==arr.length-1) return 0;
        int result= Math.min(arr.length-1-start, end);
        int i= 0;
        int j=end;
        while(i<=start && j<arr.length){
            if(arr[i]<=arr[j]){
                result= Math.min(result, j-i-1);
                i++;
            }
            else j++;
        }
        return result;
    }
}
