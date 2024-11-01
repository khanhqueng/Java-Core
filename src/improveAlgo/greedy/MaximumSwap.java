package improveAlgo.greedy;

import java.util.*;

public class MaximumSwap {
    public int maximumSwap(int num) {
        String numString= String.valueOf(num);
        List<Character> list= new ArrayList<>();
        char[] result= numString.toCharArray();
        for(int i=0;i<numString.length();i++){
            list.add(numString.charAt(i));
        }
        list.sort(Comparator.reverseOrder());
        int index=0;
        for(int i=0;i<result.length;i++){
            if(result[i]<list.get(index)){
                char temp = result[i];
                int ind= numString.lastIndexOf(list.get(index));
                result[i]=result[ind];
                result[ind]= temp;
                break;
            }
            else index++;
        }
        return Integer.parseInt(new String(result));
    }
}
