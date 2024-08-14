package improveAlgo.GasStation;

public class Main {
    public static void main(String[] args) {
        int[] gas= new int[] {2,3,4};
        int[] cost = new int[] {3,4,3};
        System.out.println(canCompleteCircuit(gas,cost));

    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
            for(int i=0;i<gas.length;i++){
                if(gas[i]<=cost[i]) continue;
                int remainingGas= gas[i];
                boolean flag= true;
                for(int j=i; j<i+gas.length;j++){
                    remainingGas-=cost[j%gas.length];
                    if(remainingGas<0) {
                        flag=false;
                        break;
                    }
                    remainingGas+=gas[(j+1)%gas.length];
                }
                if(flag) return i;
            }
            return -1;
    }
}
