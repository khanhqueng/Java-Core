package improveAlgo.Daily;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaximumLimit {
    public static void main(String[] args) {

        System.out.println(minimumSize(new int[]{7,17},2));
    }
    public static int minimumSize(int[] nums, int maxOperations) {
        int l=1,r= Arrays.stream(nums).max().getAsInt();
        while (l<r){
            int mid= (l+r)/2;
            if(canDivide(mid, maxOperations,nums))
                r=mid;
            else l=mid+1;
        }
        return l;
    }
    private static boolean canDivide(int threshold, int maxOperations, int[] nums){
        int opt= 0;
        for(int i : nums){
            opt +=  (int)Math.ceil((double) i /threshold)-1;
            if(opt>maxOperations) return false;
        }
        return true;
    }
}
