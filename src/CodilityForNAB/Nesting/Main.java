package CodilityForNAB.Nesting;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }
    public int solution(String S) {
        // Implement your solution here
        Stack<Character> stack= new Stack<>();
        for(int i=0;i<S.length();i++){
            Character c= S.charAt(i);
            if(S.charAt(i)== '{' || S.charAt(i)=='[' || S.charAt(i)=='('){
                stack.add(S.charAt(i));
            }
            else{
                if(stack.isEmpty()) return 0;
                Character pop= stack.pop();
                if(pop=='{' && c!='}') return 0;
                if(pop=='[' && c!=']') return 0;
                if(pop=='(' && c!=')') return 0;
            }
        }
        return stack.isEmpty() ? 1:0;
    }
}
