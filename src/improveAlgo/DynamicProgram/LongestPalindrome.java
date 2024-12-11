package improveAlgo.DynamicProgram;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int[][] dp = new int[s.length()][s.length()];

        //base case
        for(int i=0;i<dp.length;i++) dp[i][i]=1;
        String result= String.valueOf(s.charAt(0));
        for(int i=dp.length-1;i>=0;i--){
            for(int j=i+1;j<dp.length;j++){
                if((s.charAt(j)==s.charAt(i) && dp[i+1][j-1]==1) || (s.charAt(j)==s.charAt(i) && j-i==1)){
                    dp[i][j]=1;
                    String sub= s.substring(i,j+1);
                    if(sub.length()>result.length()) result=sub;
                }
            }
        }
        return result;
    }
}
