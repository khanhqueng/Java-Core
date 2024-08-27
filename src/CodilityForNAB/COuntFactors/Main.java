package CodilityForNAB.COuntFactors;

public class Main {
    public int solution(int N) {
        // Implement your solution here
        int count=0;
        for(int i=1;i<Math.sqrt(N);i++){
            if(N% i==0) count++;
        }
        return count*2;
    }
}
