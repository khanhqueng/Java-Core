package improveAlgo.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        List<String> number= new ArrayList<>();
        for(int i : nums){
            number.add(String.valueOf(i));
        }
        number.sort((s1,s2)->(s1+s2).compareTo(s2+s1) );
        StringBuilder sb= new StringBuilder();
        for(String num : number){
            sb.append(num);
        }
        return sb.toString();

    }
}
