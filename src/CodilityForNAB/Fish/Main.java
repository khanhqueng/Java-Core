package CodilityForNAB.Fish;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}));
    }

    public static int solution(int[] A, int[] B) {
        // Implement your solution here
        Stack<Integer> fishes = new Stack<>();
        boolean isFirstOneAppreared = false;
        int numfish=0;
        for (int i = 0; i <A.length; i++) {
            if(B[i]==1){
                if(!isFirstOneAppreared){
                    isFirstOneAppreared=true;
                }
                fishes.push(A[i]);


            }
            else{
                if(!isFirstOneAppreared) numfish++;
                else{
                    while(!fishes.isEmpty() && A[i]>fishes.peek()){
                        fishes.pop();
                    }
                    if(fishes.isEmpty()){
                        numfish++;
                        isFirstOneAppreared=false;
                    }

                }
            }





        }
        return numfish+fishes.size();
    }
}
