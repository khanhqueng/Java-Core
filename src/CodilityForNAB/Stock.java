package CodilityForNAB;

public class Stock {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{23171,21011,21123,21366,21013,21367}));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        if(A.length<=1) return 0;
        int minprice= A[0];
        int max_profit= 0;
        for(int i=1;i<A.length;i++){
            if(A[i]<minprice)
                minprice=A[i];
            else{
                int curProfit= A[i]-minprice;
                if(curProfit>max_profit) max_profit=curProfit;
            }
        }
        return max_profit;
    }
}
