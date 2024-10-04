package improveAlgo.SetMatrixZero;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public void setZeroes(int[][] matrix) {
        List<Pair> pairs= new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0) pairs.add(new Pair(i,j));
            }
        }
        for(Pair pair: pairs){
            for(int i=0;i<matrix[0].length;i++){
                matrix[pair.getRow()][i]=0;
            }
            for(int i=0;i<matrix.length;i++){
                matrix[i][pair.getCol()]=0;
            }
        }
    }
}
class Pair{
    private int row;
    private int col;

    public Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
}
