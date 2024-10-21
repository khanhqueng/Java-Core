package NAB;


import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

    }
    public int solution(String S) {
        // Implement your solution here
        int count=0;
        for(int i=1;i<S.length()-1;i++){
            if(((S.charAt(i)==S.charAt(i-1)) && (S.charAt(i)== S.charAt(i+1)))){
                count++;
                i=i+2;
            }
        }
        return count;
    }
}
