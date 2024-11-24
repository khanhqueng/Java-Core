package improveAlgo.Daily;

import java.util.Arrays;

public class MaximumMatrixSum {
    public static void main(String[] args) {

        System.out.println(maxMatrixSum(new int[][]{{1,2,3},{-1,-2,-3},{1,2,3}}));
    }
    public static long maxMatrixSum(int[][] matrix) {
        int min= Arrays.stream(matrix).flatMapToInt(Arrays::stream).map(Math::abs)
                .min().getAsInt();
        int countNegative=0;
        long sum=0;
        for(int[] i: matrix){
            for(int j: i){
                if(j<0) countNegative++;
                sum+=Math.abs(j);
            }
        }
        if(countNegative%2!=0) sum-= 2L *min;
        else return sum;
        return sum;
    }
}
