package CodilityForNAB.PassingCar;

public class Main {
    public static void main(String[] args) {
    }
    public int solution(int[] A) {
        // Implement your solution here
        int num_east= 0;
        int num_pass= 0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0)  num_east++;
            else if (A[i]==1) {
                num_pass+=num_east;
            }
        }
        if(num_pass>1_000_000_000) return -1;
        return num_pass;
    }
}
