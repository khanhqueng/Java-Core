package NAB;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

    }
    public int solution(int[] A) {
        // Implement your solution here
        int result=0;
        for(int i=0;i<A.length-1;i++){
            int curSum= A[i]+A[i+1];
            if(1+ count(i+2,curSum,A)>result){
                result= 1+ count(i+2,curSum,A);
            }
        }
        return result;
    }
    private int count( int index, int sum, int[] A){
        if(index>=A.length-1){
            return 0;
        }
        int count=0;
        if(A[index]+A[index+1]==sum){
            count= 1+count(index+2,sum,A);
        }
        return Math.max(count,count(index+1,sum,A));
    }
}
