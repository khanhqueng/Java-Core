package CodilityForNAB.EquiLeader;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,3,4,4,4,2}));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        int leader_value= Integer.MIN_VALUE;
        int leader_count=0;
        int result=0;
        int leader_count_left=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: A){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Integer key: map.keySet()){
            if(map.get(key)>A.length/2){
                leader_value=key;
                break;
            }
        }
        if(leader_value==Integer.MIN_VALUE) return 0;
        leader_count= map.get(leader_value);
        for(int i=0;i<A.length;i++){
            if(A[i]==leader_value){
                leader_count_left++;
            }
            if(leader_count_left> (i+1)/2){
                    int leader_count_right= leader_count-leader_count_left;
                    if(leader_count_right> ((A.length-(i+1))/2)) result++;
                }
        }
        return result;
    }
}
