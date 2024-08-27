package CodilityForNAB.Flags;

import java.util.*;

public class MAin {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        List<Integer> list= new ArrayList<>();
        int counter=1;
        int sum=0;
        // peaks
        for(int i=1;i<A.length-1;i++){
            if((A[i]> A[i-1]) && (A[i]>A[i+1])){
                list.add(i);
            }
        }
        if(list.isEmpty()) return 0;

        for(int i=list.size();i>=1;i--){
            counter=1;
            int firstPeak= list.get(0);
            for(int j=1; j< list.size();j++){

                if(list.get(j)- firstPeak>= i ){
                    firstPeak= list.get(j);
                    counter++;
                }
                if(counter==i) return counter;
            }
        }
        return counter;
    }

}
