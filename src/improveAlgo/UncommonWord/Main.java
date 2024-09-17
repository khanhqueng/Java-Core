package improveAlgo.UncommonWord;

import java.util.*;

public class Main {
    public static void main(String[] args){
        String s1= "this apple is sweet";
        String s2= "this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
    }
    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map= new HashMap<>();
        List<String> arrayList= new ArrayList<>(Arrays.asList(s1.split(" ")));
        List<String> list2= new ArrayList<>(Arrays.asList(s2.split(" ")));
        arrayList.addAll(list2);
        List<String> result= new ArrayList<>();
        for(String s: arrayList){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s: map.keySet()){
            if(map.get(s)==1) result.add(s);
        }
        return result.stream().toArray(String[]::new);
    }
}
