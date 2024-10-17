package improveAlgo.HashMap;

import java.util.*;

public class IsomorphicString {
    public static void main(String[] args){
        System.out.println(isIsomorphic("paper", "title"));
    }
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Set<Character>> map1 = new HashMap<>();
        Map<Character, Set<Character>> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
           Set<Character> set1=  map1.getOrDefault(s.charAt(i), new HashSet<>());
           set1.add(t.charAt(i));
           map1.put(s.charAt(i), set1);
            Set<Character> set2=  map2.getOrDefault(t.charAt(i), new HashSet<>());
            set2.add(s.charAt(i));
            map2.put(t.charAt(i), set2);
        }
        for(Set<Character> set : map1.values()){
            if(set.size()>1) return false;
        }
        for(Set<Character> set : map2.values()){
            if(set.size()>1) return false;
        }
        return true;
    }
}
