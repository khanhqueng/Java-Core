package improveAlgo.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidboaoo"));
    }
    public static boolean checkInclusion(String s1, String s2) {

        int[] s1Per= new int[26];
        int[] s2Per= new int[26];
        int end= s1.length();
        int start= 0;
        String first= s2.substring(0,s1.length());
        for(int i=0;i<s1.length();i++){
            s1Per[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s1.length();i++){
            s2Per[first.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length()-s1.length()+1 && end<s2.length();i++){
            if(isValid(s1Per,s2Per)) return true;
            s2Per[s2.charAt(end)-'a']++;
            s2Per[s2.charAt(start)-'a']--;
            start++;
            end++;
        }
        if(isValid(s1Per,s2Per)) return true;
        return false;
    }
    public static boolean isValid(int[] s1, int[]s2){
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]) return false;
        }
        return true;
    }

}
