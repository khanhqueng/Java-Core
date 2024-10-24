package improveAlgo.greedy;

import CodilityForNAB.FrogJmp.Main;

public class IncreaseTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        int a= Integer.MAX_VALUE;
        int b= Integer.MAX_VALUE;
        for(int num : nums){
            if(a>=num) a= num;
            else if(num<=b)b=num;
            else return true;
        }
        return false;
    }
}
