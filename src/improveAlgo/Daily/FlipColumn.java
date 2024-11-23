package improveAlgo.Daily;

import java.util.HashMap;
import java.util.Map;

public class FlipColumn {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> frequencyPattern = new HashMap<>();
        for(int i=0;i<matrix.length;i++){
            StringBuilder sb = new StringBuilder("*");
            for (int j=1;j<matrix[0].length;j++){
                if(matrix[i][j]==matrix[i][j-1]){
                    sb.append("*");
                }
                else sb.append("|*");
            }
            frequencyPattern.put(sb.toString(),frequencyPattern.getOrDefault(sb.toString(),0)+1);
        }
        int result= Integer.MIN_VALUE;
        for(Integer frequency : frequencyPattern.values()){
            result=Math.max(result, frequency);
        }
        return result;
    }
}
