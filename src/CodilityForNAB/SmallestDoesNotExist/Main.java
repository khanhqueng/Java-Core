package CodilityForNAB.SmallestDoesNotExist;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        Set<Integer> set= new HashSet<>();
        for(int i: A){
            set.add(i);
        }
        for(int i=1;i<=A.length+1;i++){
            if(!set.contains(i) )return i;
        }
        return 1;
    }

}
