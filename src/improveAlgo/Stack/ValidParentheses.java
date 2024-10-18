package improveAlgo.Stack;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            switch (s.charAt(i)){
                case ')':{
                    if (!stack.isEmpty()) {
                        Character character = stack.pop();
                        if (character != '(') return false;
                    }
                    else return false;
                    break;
                }
                case ']':{
                    if (!stack.isEmpty()) {
                        Character character = stack.pop();
                        if (character != '[') return false;
                    }
                    else return false;
                    break;
                }
                case '}':{
                    if (!stack.isEmpty()) {
                        Character character = stack.pop();
                        if (character != '{') return false;
                    }
                    else return false;
                    break;
                }
            }

        }
        return stack.isEmpty();
    }
}
