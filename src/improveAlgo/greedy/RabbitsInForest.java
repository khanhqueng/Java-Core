package improveAlgo.greedy;

import java.util.HashMap;
import java.util.Map;

public class RabbitsInForest {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> frequency= new HashMap<>();
        for(int i : answers){
            frequency.put(i, frequency.getOrDefault(i,0)+1);
        }
        int result= 0;
        for(Integer key : frequency.keySet()){
            if(frequency.get(key)<=key+1) result+=key+1;
            else {
                int group = (int) Math.ceil((double) frequency.get(key) /(key+1));
                result += group* (key+1);
            }
        }
        return result;
    }
}
