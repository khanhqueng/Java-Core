package improveAlgo.extraCharactersInAString;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(minExtraChar("dwmodizxvvbosxxw",new String[]{"ox","lb","diz","gu","v","ksv","o","nuq","r","txhe","e","wmo","cehy","tskz","ds","kzbu"}));

    }
    public static int minExtraChar(String s, String[] dictionary) {
        Arrays.sort(dictionary, Comparator.comparingInt(String::length).reversed());
        int[] dp = new int[s.length()];
        for(String string: dictionary){
            for(int i=0; i<s.length() ;i++){
                if( s.indexOf(string, i)!=-1 && dp[i]==0){
                    for(int k=s.indexOf(string,i);k<s.indexOf(string,i)+ string.length();k++){
                        dp[k]=1;
                    }
                     i= s.indexOf(string, i);
                    i+=string.length()-1;
                }
            }
        }

        return (int) Arrays.stream(dp).filter(a-> a==0).count();
    }
}
