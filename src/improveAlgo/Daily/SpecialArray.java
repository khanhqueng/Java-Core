package improveAlgo.Daily;

public class SpecialArray {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] prefix = new int[nums.length];
        for(int i=1;i<nums.length;i++){
            if((nums[i]-nums[i-1]) %2 !=0){
                prefix[i]=prefix[i-1];
            }
            else prefix[i]=prefix[i-1]+1;
        }
        boolean[] result= new boolean[queries.length];
        for(int i=0; i<queries.length;i++){
            if( prefix[queries[i][0]] == prefix[queries[i][1]])
                result[i]=true;
            else result[i]=false;
        }
        return result;
    }
}
