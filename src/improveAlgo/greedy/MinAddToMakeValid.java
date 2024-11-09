package improveAlgo.greedy;

import java.util.Stack;

public class MinAddToMakeValid {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int result=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') stack.add(s.charAt(i));
            else if( s.charAt(i)==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else result++;
            }
        }
        if(!stack.isEmpty()){
            for(Character character: stack) result++;
        }
        return result;
    }
}
