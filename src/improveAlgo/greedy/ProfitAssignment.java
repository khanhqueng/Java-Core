package improveAlgo.greedy;

import java.util.Arrays;

public class ProfitAssignment {
    public static void main(String[] args){
        System.out.println(maxProfitAssignment(new int[]{2,4,6,8,10}, new int[]{10,20,30,40,50},new int[]{4,5,6,7}));

    }
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        Arrays.sort(worker);
        for( int i=0;i<difficulty.length;i++){
            for(int j=i+1;j<difficulty.length;j++){
                if(profit[j]>profit[i]){
                    int temp =profit[j];
                    profit[j]= profit[i];
                    profit[i]=temp;

                    int temp2 =difficulty[j];
                    difficulty[j]= difficulty[i];
                    difficulty[i]=temp2;
                }
            }
        }
        int result=0;
        for(int i=0;i<worker.length;i++){
            for(int j=0;j<difficulty.length;j++){
                if(difficulty[j]<=worker[i]) {
                    result += profit[j];
                    break;
                }
            }
        }
        return result;
    }
}
