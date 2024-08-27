package CodilityForNAB.MaxSliceSum;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,2,-6,4,0}));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            sum+=A[i];
            if(sum<0){
                if(sum>max) max= sum;
                sum=0;
                continue;
            }
            if(sum>max) max= sum;

        }

        return max;
    }
}
