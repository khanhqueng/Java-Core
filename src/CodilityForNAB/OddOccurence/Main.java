package CodilityForNAB.OddOccurence;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,1}));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        Map<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<A.length;i++){
            map.put(A[i], map.getOrDefault(A[i],0)+1);
        }
        for(Integer i: map.keySet()){
            if( map.get(i)% 2 != 0) return i;
        }
        return -1;
    }
}
