package CodilityForNAB.PermCheck;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    }
    public int solution(int[] A) {
        // Implement your solution here
        Set<Integer> set= new HashSet<>();
        for(int i=1;i<=A.length;i++) set.add(i);
        for(int i: A){
            if(set.contains(i)) set.remove(i);
            if(set.isEmpty()) return 1;
        }
        return 0;
    }
}
