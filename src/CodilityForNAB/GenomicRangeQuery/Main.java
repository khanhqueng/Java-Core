package CodilityForNAB.GenomicRangeQuery;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {



    }
    public int[] solution(String S, int[] P, int[] Q) {
        // Implement your solution here
        Map<Character,Integer> symbol= new HashMap<>();
        symbol.put('A', 1);
        symbol.put('C',2);
        symbol.put('G',3);
        symbol.put('T',4);
        int[] result= new int[P.length];
        Arrays.fill(result,Integer.MAX_VALUE);
        for(int i=0;i<P.length;i++){
            for(int j= P[i];j<=Q[i];j++){
                result[i]= Math.min(result[i],symbol.get(S.charAt(j)));
            }
        }
        return result;
    }
}
