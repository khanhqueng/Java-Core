package improveAlgo.Stack;

import java.util.*;

public class BasicCalculator {
    public static void main(String[] args){
        System.out.println(calculate("1-(2+3-(4+(5-(1-(2+4-(5+6))))))"));
    }
    public static int calculate(String s) {
        String trimString= s.replaceAll("\\s+", "");
        Stack<String> stack = new Stack<>();
        StringBuilder numb= new StringBuilder();
        if(!trimString.contains("(")) return sumAString(trimString);
        else {
            for(int i=0;i<trimString.length();i++){
                if(i<trimString.length()-1 && !Arrays.asList('+','-','(',')').contains(trimString.charAt(i)) && !Arrays.asList('+','-','(',')').contains(trimString.charAt(i+1)) ){
                    numb.append(trimString.charAt(i));
                    continue;
                }
                else if((i==trimString.length()-1 && trimString.charAt(i)!=')') || !Arrays.asList('+','-','(',')').contains(trimString.charAt(i)) && Arrays.asList('+','-','(',')').contains(trimString.charAt(i+1))){
                    numb.append(trimString.charAt(i));
                    stack.push(String.valueOf(numb));
                    numb= new StringBuilder();
                }
                if(Arrays.asList('-','+','(').contains(trimString.charAt(i))){
                    stack.push(String.valueOf(trimString.charAt(i)));
                } else if ( trimString.charAt(i)==')') {
                    StringBuilder sequence= new StringBuilder();
                    while(!Objects.equals(stack.peek(), String.valueOf('('))){
                        sequence.insert(0,stack.pop());
                    }
                    stack.pop();
                    int curr_resul= sumAString(String.valueOf(sequence));
                    stack.push(String.valueOf(curr_resul));
                }
            }
            if(stack.size()==1) return Integer.parseInt(stack.peek());
            else {
                StringBuilder result= new StringBuilder();
                while(!stack.isEmpty()){
                    result.insert(0,stack.pop() );
                }
                return sumAString(String.valueOf(result));
            }
        }
    }
    public static int sumAString(String s){
        s= s.replaceAll("--","+");
        s= s.replaceAll("\\+-","-");
        String[] nums= s.split("[+-]");
        if(nums.length==1) return Integer.parseInt(s);
        List<Character> operator= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Arrays.asList('+', '-').contains(s.charAt(i))){
                operator.add(s.charAt(i));
            }
        }
        int result;
        int index=0;
        if(s.charAt(0)=='-'){
            result= -Integer.parseInt(nums[1]);
            index=1;
        } else if (s.charAt(0)=='+') {
            result= Integer.parseInt(nums[1]);
            index=1;
        } else
            result= Integer.parseInt(nums[0]);
        for(int i=index;i< operator.size() && i+1< nums.length;i++){
            switch (operator.get(i)){
                case '+':{
                    result+= Integer.parseInt(nums[i+1]);
                    break;
                }
                case '-':{
                    result-= Integer.parseInt(nums[i+1]);
                    break;
                }
            }
        }
        return result;
    }
}
