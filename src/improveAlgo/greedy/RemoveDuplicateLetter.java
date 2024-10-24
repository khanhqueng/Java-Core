package improveAlgo.greedy;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class RemoveDuplicateLetter {
    public static void main(String[] args){
        System.out.println(removeDuplicateLetters("cbacdcbc"));

    }
    public static String removeDuplicateLetters(String s) {
        Map<Character, Integer> map= new HashMap<>();
        Stack<Character> stack= new Stack<>();
        int[] isVisited= new int[26];
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), i);
        }
        for(int i=0;i<s.length();i++){
            if(isVisited[s.charAt(i)-'a']==1) {
                continue;
            }
            while(!stack.isEmpty() && s.charAt(i)-'a'< stack.peek()-'a' && i< map.get(stack.peek()) ){
                isVisited[stack.pop()-'a']=0;
        }
            stack.push(s.charAt(i));
            isVisited[s.charAt(i)-'a']=1;
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
