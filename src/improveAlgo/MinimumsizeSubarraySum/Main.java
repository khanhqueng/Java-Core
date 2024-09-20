package improveAlgo.MinimumsizeSubarraySum;

public class Main {
    public static void main(String[] args){

        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int end=0;
        int min= Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>=target) {
                end = i;

                while (target<=sum && start<end){
                    min= Math.min(min,end-start+1);
                    sum-=nums[start];
                    start++;
                }

            }


        }
        return (min==Integer.MAX_VALUE) ? 0 : min;
    }
}
