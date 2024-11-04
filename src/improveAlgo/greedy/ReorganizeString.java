package improveAlgo.greedy;

import java.util.*;

public class ReorganizeString {
    public String reorganizeString(String s) {
        Map<Character, Integer> frequency= new HashMap<>();
        for(int i=0;i<s.length();i++){
            frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> queue= new PriorityQueue<>((a,b) -> frequency.get(b)-frequency.get(a));
        queue.addAll(frequency.keySet());
        StringBuilder sb= new StringBuilder();
        while(queue.size()>=2){
            Character character1= queue.poll();
            Character character2= queue.poll();
            sb.append(character1);
            sb.append(character2);
            frequency.put(character1, frequency.get(character1)-1);
            frequency.put(character2, frequency.get(character2)-1);
            if(frequency.get(character1)>0) queue.add(character1);
            if(frequency.get(character2)>0) queue.add(character2);
        }
        if(!queue.isEmpty()){
            if(frequency.get(queue.peek())>1) return "";
            sb.append(queue.poll());
        }
        return sb.toString();
    }
}
