package improveAlgo.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WorldPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words= s.split(" ");
        Map<Character, Set<String>> map1 = new HashMap<>();
        Map<String, Set<Character>> map2 = new HashMap<>();
        if(words.length!= s.length()) return false;
        for(int i=0;i<words.length;i++){
            Set<String> set1=  map1.getOrDefault(pattern.charAt(i), new HashSet<>());
            set1.add(words[i]);
            map1.put(pattern.charAt(i), set1);
            Set<Character> set2=  map2.getOrDefault(words[i], new HashSet<>());
            set2.add(pattern.charAt(i));
            map2.put(words[i], set2);
        }
        for(Set<String> set : map1.values()){
            if(set.size()>1) return false;
        }
        for(Set<Character> set : map2.values()){
            if(set.size()>1) return false;
        }
        return true;
    }
}
