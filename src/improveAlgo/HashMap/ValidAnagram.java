package improveAlgo.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
        }
        if(!map1.equals(map2)) return false;
        return true;
    }
}
