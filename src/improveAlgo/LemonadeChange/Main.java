package improveAlgo.LemonadeChange;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        System.out.println(lemonadeChange(new int[]{5,5,5,5,20,20,5,5,20,5}));
    }
    public static boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5) map.put(bills[i], map.getOrDefault(bills[i],0)+1);
            if(bills[i]==10) {
                map.put(bills[i], map.getOrDefault(bills[i],0)+1);
                map.put(5,map.getOrDefault(5,0)-1);
                if(map.get(5)<0) return false;
            }
            if(bills[i]==20) {
                map.put(bills[i], map.getOrDefault(bills[i],0)+1);
                if(map.getOrDefault(10,0)==0){
                    map.put(5,map.getOrDefault(5,0)-3);
                }
                else if(map.getOrDefault(10,0)>0){
                    map.put(5,map.getOrDefault(5,0)-1);
                    map.put(10,map.getOrDefault(10,0)-1);
                }
                if(map.get(5)<0 || map.getOrDefault(10,0)<0) return false;
            }

        }
        return  true;
    }
}
