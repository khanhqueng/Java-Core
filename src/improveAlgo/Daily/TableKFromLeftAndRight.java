package improveAlgo.Daily;

import java.util.HashMap;
import java.util.Map;

public class TableKFromLeftAndRight {
    public static void main(String[] args) {

        System.out.println(takeCharacters("aabaaaacaabc",2));
    }
    public static int takeCharacters(String s, int k) {
        int[] frequency= new int[3];
        for(int i=0;i<s.length();i++){
            frequency[s.charAt(i)-'a']++;
        }
        if(Math.min(Math.min(frequency[0],frequency[1]), frequency[2])< k) return -1;
        int result = Integer.MAX_VALUE;
        int left =0;
        for( int right=0;right<s.length();right++){
            frequency[s.charAt(right)-'a']--;
            while(Math.min(Math.min(frequency[0],frequency[1]), frequency[2])< k){
                frequency[s.charAt(left)-'a']++;
                left++;

            }
            result= Math.min(result, s.length()-(right-left+1));
        }
        return result;
    }

}
