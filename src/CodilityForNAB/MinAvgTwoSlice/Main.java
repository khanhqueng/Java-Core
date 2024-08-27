package CodilityForNAB.MinAvgTwoSlice;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 2, 5, 1, 5, 8}));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        float min= Float.MAX_VALUE;
        int start_pos= 0;
        for(int i=0;i<A.length-2;i++){
            float avg_2= (float) (A[i] + A[i + 1]) /2;
            float avg_3= (float) (A[i] + A[i + 1] + A[i + 2]) /3;
            float min_avg= Math.min(avg_3,avg_2);
            if(min_avg<min){
                min= min_avg;
                start_pos=i;
            }

        }
        if((float) (A[A.length - 2] + A[A.length - 1]) /2 <min){
            return A.length-2;
        }
        return start_pos;
    }
}
