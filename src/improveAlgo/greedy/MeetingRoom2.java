package improveAlgo.greedy;

import java.util.*;

public class MeetingRoom2 {
    public static void main(String[] args){
        PriorityQueue<String> string= new PriorityQueue<>();
        string.add("Welcome");
        string.add("To");
        string.add("Geeks");
        string.add("For");
        string.add("Geeks");
        System.out.println(string.poll());
        System.out.println(string.poll());
        System.out.println(string.poll());
        System.out.println(string.poll());
        System.out.println(string);

    }
    public static int minMeetingRooms(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(interval-> interval[0]));
        int room= 0;
        PriorityQueue<Integer> endtime= new PriorityQueue<>();
        for(int[] interval: intervals){
            endtime.add(interval[1]);
            if(interval[0]<endtime.peek()) room++;
            else
                endtime.poll();
        }
        return room;
    }
}
