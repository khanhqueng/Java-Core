package improveAlgo.LongestSubstring;

import java.util.*;

public class Main {
    public int findTheLongestSubstring(String s) {
       int [][] prefix= new int[s.length()][5];
       if(vowelIndex(s.charAt(0))!= -1) prefix[0][vowelIndex(s.charAt(0))]++;
       for(int i=1;i<s.length();i++){
           int ind= vowelIndex(s.charAt(i));
           for(int j=0;j<5;j++){
               if(ind==j) prefix[i][j]=  prefix[i-1][j]+1;
               else prefix[i][j]=  prefix[i-1][j];
           }
       }
        for (int i = s.length() - 1; i >= 0; i--) {

            for (int j = 0; j < s.length() - i; j++) {
                if (checkValid(prefix, s, i, i + j))
                    return i + 1;
            }
        }
       return 0;
    }
    public boolean checkValid(int[][] preSum, String s, int left, int right) {

        int idx = vowelIndex(s.charAt(left));

        for (int i = 0; i < 5; i++)
            if (((preSum[right][i] - preSum[left][i] + (idx == i ? 1 : 0)) & 1) == 1)
                return false;

        return true;
    }
    public int vowelIndex(Character character){
        if (character == 'a')
            return 0;
        else if (character == 'e')
            return 1;
        else if (character == 'i')
            return 2;
        else if (character == 'o')
            return 3;
        else if (character == 'u')
            return 4;
        else
            return -1;
    }
}
