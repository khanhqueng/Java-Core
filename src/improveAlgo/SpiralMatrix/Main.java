package improveAlgo.SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result= new ArrayList<>();
        int start=0;
        int row=matrix.length;
        int col =matrix[0].length;
        while (start< row && start<col){
            spiralAccordingToLayer(result,start,row,col,matrix);
            start++;
            row--;
            col--;
        }
        return result;
    }
    public void spiralAccordingToLayer(List<Integer> result, int start, int x, int y, int[][]matrix){
        for(int col=start;col<y;col++){
            result.add(matrix[start][col]);
        }
        for(int row= start+1;row<x-1;row++){
            result.add(matrix[row][y-1]);
        }
        for(int col= y-1;col>=start;col--){
            result.add(matrix[x-1][col]);
        }
        for(int row= y-2;row>=start;row--){
            result.add(matrix[row][start]);
        }
    }
}
