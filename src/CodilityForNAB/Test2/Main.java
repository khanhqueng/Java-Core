package CodilityForNAB.Test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3,4,2}, new int[]{2,5,7,2}));
    }
    public static int solution(int[] P, int[] S) {
        List<Integer> list= new ArrayList<>(Arrays.stream(S).boxed().toList());
        Collections.sort(list, Collections.reverseOrder());
        int sumP= IntStream.of(P).sum();
        int sumS= 0;
        for(int i=0;i<list.size();i++){
            sumS+=list.get(i);
            if(sumS>=sumP)
                return i+1;
        }
        return S.length;
    }
}
