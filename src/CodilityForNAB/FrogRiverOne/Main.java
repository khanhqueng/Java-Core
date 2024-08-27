package CodilityForNAB.FrogRiverOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    }
    public int solution(int X, int[] A) {
        // Implement your solution here
        if(X> A.length) return -1;
        Set<Integer> set= new HashSet<>();
        for(int i=1;i<=X;i++) set.add(i);
        for(int i=0;i<A.length;i++){
            if(set.contains(A[i])) set.remove(A[i]);
            if(set.isEmpty()) return i;
        }
        return -1;
    }
}
