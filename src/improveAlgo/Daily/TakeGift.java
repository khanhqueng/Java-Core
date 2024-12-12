package improveAlgo.Daily;

import java.util.Map;
import java.util.PriorityQueue;

public class TakeGift {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue= new PriorityQueue<>((a,b)-> b-a);
        for(int i: gifts)
            queue.add(i);
        for(int i=k;i>=1;i--){
            int gift= queue.poll();
            queue.add((int) Math.floor(Math.sqrt(gift)));
        }
        long sum=0;
        for(int i: queue) sum+=i;
        return sum;
    }
}
