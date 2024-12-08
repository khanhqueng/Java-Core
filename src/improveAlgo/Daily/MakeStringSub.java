package improveAlgo.Daily;

public class MakeStringSub {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0,j=0;
        for(;i<str1.length() && j<str2.length();i++){
            if(str2.charAt(j)==str1.charAt(i) || str2.charAt(j)==str1.charAt(i)+1) {
                j++;
                continue;
            }
            if(str2.charAt(j)=='a' && str1.charAt(i)=='z') j++;
        }
        if(j==str2.length()) return true;
        return false;
    }
}
