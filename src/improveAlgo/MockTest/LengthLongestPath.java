package improveAlgo.MockTest;

import java.util.Stack;

public class LengthLongestPath {
    public int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        int result= 0;
        for(String line : input.split("\n")){
            int frequencyTab= line.lastIndexOf("\t")+1;
            while( frequencyTab< stack.size()-1)
                stack.pop();
            int len = stack.peek()+ line.length()- frequencyTab+1;
            if(frequencyTab==0)
                len--;
            if(line.contains("."))
                result= Math.max(result,len);
            else
                stack.add(len);

        }
        return result;
    }

}
