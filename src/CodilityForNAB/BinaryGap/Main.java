package CodilityForNAB.BinaryGap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public static int solution(int N) {
        // Implement your solution here
        if(N ==1) return 0;
        String binary= Integer.toBinaryString(N);
        int i=0;
        int max=0;
        for(int j=1;j<binary.length();j++){
            if( binary.charAt(j)=='1'){
                int current_i= j-i-1;
                max= Math.max(max, current_i);
                i=j;
            }
        }
        return max;
    }
}
