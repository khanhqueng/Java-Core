package improveAlgo.Daily;

import java.util.PriorityQueue;

public class ConductString {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] frequency= new int[26];
        PriorityQueue<int[] > queue = new PriorityQueue<>((a,b)-> b[0]-a[0]);
        for(int i=0;i<s.length();i++){
            frequency[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(frequency[i]>0) queue.add(new int[]{i+'a', frequency[i]});
        }
        StringBuilder sb= new StringBuilder();
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int remain = current[1];
            int k= Math.min(current[1], repeatLimit);
            for(int i=0;i<k;i++){
                sb.append((char) current[0]);
            }
            remain-= k;
            if(remain>0){
                if(queue.isEmpty()) break;
                int[] next = queue.poll();
                sb.append((char) next[0]);
                next[1]--;
                if(next[1]>0) queue.add(next);
                queue.add(new int[]{current[0], remain});
            }
        }
        return sb.toString();


    }
}
