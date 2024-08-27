package CodilityForNAB.CountDiv;

public class Main {
    public static void main(String[] args) {

    }
    public int solution(int A, int B, int K) {
        // Implement your solution here
        int start_count= 0;
        int last_count=0;
        if(B%K ==0 ) last_count=B;
        else last_count= B-B%K;
        if(A%K ==0 ) start_count=A;
        else start_count= A+ (K-A%K);
        return (last_count-start_count)/K+1;
    }
}
