package improveAlgo.greedy;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n= senate.length();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R') radiant.add(i);
            else dire.add(i);
        }
        while(!radiant.isEmpty() && !dire.isEmpty()){
            if(radiant.poll()<dire.poll()){
                radiant.add(n++);
            }
            else dire.add(n++);
        }
        return radiant.size()> dire.size() ? "Radiant" : "Dire";
    }
}
