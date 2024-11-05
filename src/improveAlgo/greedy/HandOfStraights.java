package improveAlgo.greedy;

import java.util.*;

public class HandOfStraights {
    public static void main(String[] args){
        System.out.println(isNStraightHand(new int[]{1,2,3,6,2,3,4,7,8}, 3));

    }
    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length% groupSize !=0) return false;
        Map<Integer,Integer> frequency = new HashMap<>();
        for(int i : hand){
            frequency.put(i, frequency.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> priorityQueue= new PriorityQueue<>(Comparator.comparingInt(a -> a));
        priorityQueue.addAll(frequency.keySet());
        while(priorityQueue.size()>=groupSize){
            List<Integer> consecutive= new ArrayList<>();
            consecutive.add(priorityQueue.poll());
            for(int i=2;i<=groupSize;i++){
                if(priorityQueue.peek()== consecutive.getLast()+1) consecutive.add(priorityQueue.poll());
                else return false;
            }
            for (Integer integer : consecutive) {
                frequency.put(integer, frequency.getOrDefault(integer, 0) - 1);
                if (frequency.get(integer) > 0) priorityQueue.add(integer);
            }
        }
        return priorityQueue.isEmpty();
    }
}
