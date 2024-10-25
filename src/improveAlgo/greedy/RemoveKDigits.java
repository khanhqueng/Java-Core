package improveAlgo.greedy;

import java.math.BigInteger;
import java.util.Stack;

public class RemoveKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
        if(num.length()==k) return "0";
        for(int i=0;i<num.length();i++){
            while(!stack.isEmpty() && num.charAt(i)-'0'<= stack.peek()-'0' && k>0){
                stack.pop();
                k--;
            }
            stack.add(num.charAt(i));
        }
        if(k>0){
            for(int i=1;i<=k;i++){
                stack.pop();
            }
        }
        StringBuilder sb= new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb.reverse();
        for(Character c: stack){
            sb.append(c);
        }
        BigInteger bigInteger= new BigInteger(sb.toString());
        return String.valueOf(bigInteger);
        // remove 0 character in head
//        String res = sb.reverse().toString();
//        while(i < res.length() && res.charAt(i) == '0'){
//            i++;
//        }
//        if(i == res.length()){
//            return "0";
//        }
//        return res.substring(i);
    }
}
