package improveAlgo.Stack;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int result= 0;
        for(int i=0;i< tokens.length;i++){
            if(!Arrays.asList("+", "-", "*", "/").contains(tokens[i])){
                stack.push(tokens[i]);
            }
            else{
                String num1= stack.pop();
                String num2= stack.pop();
                switch (tokens[i]){
                    case "+":{
                        int sum= Integer.parseInt(num1)+ Integer.parseInt(num2);
                        stack.push(String.valueOf(sum));
                        result=sum;
                        break;
                    }
                    case "-":{
                        int sub= Integer.parseInt(num2)- Integer.parseInt(num1);
                        stack.push(String.valueOf(sub));
                        result=sub;
                        break;
                    }
                    case "*":{
                        int mutiple= Integer.parseInt(num2)* Integer.parseInt(num1);
                        stack.push(String.valueOf(mutiple));
                        result=mutiple;
                        break;
                    }
                    case "/":{
                        int divide= Integer.parseInt(num2)/ Integer.parseInt(num1);
                        stack.push(String.valueOf(divide));
                        result=divide;
                        break;
                    }
                }

            }
        }
        return result;
    }
}
