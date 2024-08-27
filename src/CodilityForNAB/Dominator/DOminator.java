package CodilityForNAB.Dominator;

import java.util.*;
import java.util.stream.Collectors;

public class DOminator {
    public int solution(int[] A) {
        // Implement your solution here
        List<Integer> list= new ArrayList<>(Arrays.stream(A).boxed().collect(Collectors.toList()));
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: A){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Integer key: map.keySet()){
            if(map.get(key)>A.length/2) return list.indexOf(key);
        }
        return -1;

    }
}
