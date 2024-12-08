package improveAlgo.Daily;

import java.util.*;

public class CheckDouble {
    public boolean checkIfExist(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i : map.keySet()){
            if(i==0) {
                if (map.getOrDefault(i, 2) < 2) continue;
            }
            if(map.getOrDefault(i*2,0)!=0) return true;
        }
        return false;
    }
}
