package CodilityForNAB.PiChallenge;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution("sssssddd","ccccabcd")
        );
    }
    public static int solution(String P, String Q) {
        // Implement your solution here
        // count maximum appear each char
        Map<Character, Integer> map =new HashMap<>();
        for(int i=0;i<P.length();i++){
            if(P.charAt(i)==Q.charAt(i)){
                map.put(P.charAt(i), map.getOrDefault(P.charAt(i),0)+1);
                continue;
            }
            map.put(P.charAt(i), map.getOrDefault(P.charAt(i),0)+1);
            map.put(Q.charAt(i), map.getOrDefault(Q.charAt(i),0)+1);

        }
        // filter case overlap char at the same index
        for(int i=0;i<P.length();i++){
            if(map.get(P.charAt(i))>map.get(Q.charAt(i))){
                map.put(Q.charAt(i), map.getOrDefault(Q.charAt(i),0)-1);
            }
            else if(map.get(P.charAt(i))<map.get(Q.charAt(i))){
                map.put(P.charAt(i), map.getOrDefault(P.charAt(i),0)-1);
            }
            else if(P.charAt(i)!=Q.charAt(i) && Objects.equals(map.get(P.charAt(i)), map.get(Q.charAt(i)))){
                map.put(Q.charAt(i), map.getOrDefault(Q.charAt(i),0)-1);
            }

        }

        List<Integer> list= new ArrayList<>(map.values());
        Collections.sort(list,Collections.reverseOrder());
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
            if(sum>=P.length()) return i+1;
        }
        return -1;
    }
}
