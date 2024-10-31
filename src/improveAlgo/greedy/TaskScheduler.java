package improveAlgo.greedy;

import java.time.chrono.MinguoDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] frequency= new int[26];
        for(Character character: tasks){
            frequency[character-'A']++;
        }
        Arrays.sort(frequency);
        int max= frequency[25]-1;
        int idle= max * n;
        for(int i=frequency.length-2;i>=0 && frequency[i]!=0;i--){
            idle-= Math.min(max, frequency[i]);
        }
        return idle >0 ? tasks.length+idle : tasks.length;
    }
}
