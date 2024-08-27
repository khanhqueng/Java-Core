package improveAlgo.jumpGame;

public class Main {
    public static void main(String[] args){

    }
    public int jump(int[] nums) {
        int maxJump= 0;
        int count=0;
        int maxReach=0;
        for(int i=0;i<nums.length;i++){
            maxJump= Math.max(maxJump, i+nums[i]);
            if(maxJump>=nums.length-1){
                count++;
                break;
            }
            if(i==maxReach){
                maxReach=maxJump;
                count++;
            }


        }
        return count;
    }

}
