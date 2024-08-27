package CodilityForNAB.YearOfTheRabbit;

public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 5, 2, 8, 7}, new int[]{7, 1, 9, 8, 5, 7}));
    }
    public static int solution(int[] A, int[] B) {
        boolean neededRotate=false;
        for(int i=0; i<A.length;i++){
            if (A[i] == B[i]) {

                neededRotate = true;
                break;
            }
        }
        if(!neededRotate) return 0;
        // Implement your solution here
        for(int i=1;i<B.length;i++){
            boolean flag= true;
            int[] C = B.clone();
            swap(C,0,B.length-1);
            swap(C,0,i-1);
            swap(C,i, B.length-1);
            for(int j=0;j<A.length;j++){
                if(A[j]==C[j]) {
                    flag=false;
                    break;
                }
            }
            if(flag) return i;
        }
        return -1;
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
