package improveAlgo.ConcatenationOfAllWords;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[]{"fooo","barr","wing","ding","wing"}));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        int sizeWindow= words[0].length()* words.length;
        int slide= words[0].length();
        List<Integer> result= new ArrayList<>();
        for(int start=0;start<=s.length()-sizeWindow;start++){
            String curr_result= s.substring(start,start+sizeWindow);
            boolean flag= true;
            for(String string: words){
                if(!curr_result.contains(string)) {
                    flag=false;
                    break;
                }
                else {
                    curr_result= curr_result.replaceFirst(string,"");
                }
            }
            if(flag) result.add(start);

        }
        return result;
    }
}
