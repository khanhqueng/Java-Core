package CodilityForNAB.MinPerimeterRetacgle;

public class Main {
    public int solution(int N) {
        int min= Integer.MAX_VALUE;
        // Implement your solution here
        for(int i=1;i<=Math.sqrt(N);i++){
            if(N% i==0) {
                min= Math.min(min, 2*(i+ N/i));

            }
        }
        return min;

    }
}
