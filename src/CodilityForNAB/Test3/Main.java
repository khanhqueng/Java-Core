package CodilityForNAB.Test3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,1,2,1}));
    }
    public static int solution(int[] A) {
        int sumTree= Arrays.stream(A).sum();
        int equalTree= 0;
        int count =0;
        if((sumTree % A.length)!= 0){
            equalTree= sumTree/A.length+1;
        }
        else equalTree= sumTree/A.length;
        for(int i=0;i<A.length;i++){
            if(A[i]<equalTree) count+=equalTree-A[i];
        }
        return count;
    }
}
