package improveAlgo.GroupAnagrams;

import java.util.*;

public class Main {
    public List<List<String>> groupAnagrams(String[] strs) {
        Set<Map<Character, Integer>> set = new LinkedHashSet<>();
        List<List<String>> result= new ArrayList<>();
        for(String s: strs){
            Map<Character, Integer> charDuplicate= new HashMap<>();
            for(int i=0;i<s.length();i++){
                charDuplicate.put(s.charAt(i),charDuplicate.getOrDefault(s.charAt(i),0)+1);
            }
            if(!set.contains(charDuplicate)) {
                set.add(charDuplicate);
                List<String> list= new ArrayList<>();
                list.add(s);
                result.add(list);
            }
            else {
                int k=0;
                for(Map<Character, Integer> map: set){
                    if(map.equals(charDuplicate)){
                        result.get(k).add(s);
                        break;
                    }
                    k++;
                }
            }
        }
        return result;
    }
}
