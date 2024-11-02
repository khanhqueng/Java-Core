package improveAlgo.greedy;

import java.util.PriorityQueue;

public class Monotone {
    public static void main(String[] args){
        System.out.println(monotoneIncreasingDigits(10));

    }
    public static int monotoneIncreasingDigits(int n) {
        String num= String.valueOf(n);
        StringBuilder result= new StringBuilder(String.valueOf(num.charAt(0)));
        for(int i=1;i<num.length();i++){
            if( num.charAt(i)<num.charAt(i-1)){
                int j=i-1;
                int index=0;
                while (j>0){
                    int decrease=Integer.parseInt(String.valueOf(num.charAt(j)))-1;
                    if( decrease< Integer.parseInt(String.valueOf(num.charAt(j-1)))) j--;
                    else {
                        index=j;
                        break;
                    }
                }
                int changed= Integer.parseInt(String.valueOf(result.charAt(index)))-1;
                StringBuilder replace= new StringBuilder(String.valueOf(changed));
                replace.append("9".repeat(Math.max(0, num.length() - (j + 1))));
                return Integer.parseInt(result.replace(index,num.length(),replace.toString()).toString());
            }
            else result.append(num.charAt(i));
        }
        return Integer.parseInt(result.toString());
    }
}
