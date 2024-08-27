package CodilityForNAB.CyclicRotation;

public class Main {
    public static void main(String[] args) {

    }
    public static int[] solution(int[] A, int K) {
        K%=A.length;
        // Implement your solution here
        swap(A,0,A.length-1);
        swap(A, 0, K-1);
        swap(A,K, A.length-1);
        return A;
    }
    public static int[] swap(int[]A, int start, int end){
        while(start<end){
            int temp= A[start];
            A[start]= A[end];
            A[end]= temp;
            start++;
            end--;
        }
        return A;
    }
}
