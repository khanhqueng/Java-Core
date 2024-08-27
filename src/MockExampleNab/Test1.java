package MockExampleNab;

public class Test1 {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{1,2,4,10,9,8,7,11,13,15}, 2));
    }
    public static int solution(int[] A, int K){
        int[] dp = new int[A.length];
        dp[0]=1;
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<A.length-1;i++){
            int max_consecutive= Math.max(A[i],A[i+1]);
            int min_consecutive= Math.min(A[i],A[i+1]);
            if(max_consecutive>max){
                max= max_consecutive;
            }
            if(min_consecutive<min){
                min=min_consecutive;
            }
            if(max-min<=K){
                dp[i+1]=dp[i];
            }
            else {
                dp[i+1]= dp[i]+1;
                max= Integer.MIN_VALUE;
                min= Integer.MAX_VALUE;
            }
        }
        return dp[dp.length-1];
    }
}
