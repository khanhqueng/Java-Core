package improveAlgo.greedy;

public class MatrixScore {
    public int matrixScore(int[][] grid) {
        // row
        for(int i=0;i<grid.length;i++){
            if(grid[i][0]!=1){
                for(int j=0;j<grid[0].length;j++){
                    grid[i][j] = (grid[i][j]==1)? 0 : 1;
                }
            }
        }
        // col
        for(int j=0;j<grid[0].length;j++){
            int count0=0;
            for(int i=0;i<grid.length;i++){
                count0= (grid[i][j]==0) ? count0+1 : count0;
            }
            if(count0>grid.length/2){
                for(int k=0;k<grid.length;k++){
                    grid[k][j] = (grid[k][j]==1)? 0 : 1;
                }
            }
        }
        int result=0;
        for (int[] row : grid) {
            int rowValue = 0;
            for (int bit : row) {
                rowValue = (rowValue << 1) | bit;  // Shift and add bit
            }
            result+= rowValue;
        }
        return result;
    }
}
