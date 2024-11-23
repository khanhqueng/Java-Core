package improveAlgo.Daily;

import java.util.Arrays;

public class CountUnguardCell {
    public static void main(String[] args) {

        System.out.println(countUnguarded(7,1,new int[][]{{0,0},{4,0},{1,0}},new int[][]{{6,0},{5,0},{3,0}}));
    }
    public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] matrix = new int[m][n];
        int count=0;
        for(int i=0;i< walls.length;i++){
            matrix[walls[i][0]][walls[i][1]]= 1;
        }
        for(int i=0;i< guards.length;i++){
            matrix[guards[i][0]][guards[i][1]]= 1;
        }
        for(int i=0;i<guards.length;i++){
            for(int j= guards[i][1]-1;j>=0;j--){
                if(matrix[guards[i][0]][j]==2) continue;
                if(matrix[guards[i][0]][j]==1 ) break;
                matrix[guards[i][0]][j]=2;
            }
            for(int j= guards[i][1]+1;j<n;j++){
                if(matrix[guards[i][0]][j]==2) continue;
                if(matrix[guards[i][0]][j]==1 ) break;
                matrix[guards[i][0]][j]=2;
            }
            for(int j= guards[i][0]-1;j>=0;j--){
                if(matrix[j][guards[i][1]]==2) continue;
                if(matrix[j][guards[i][1]]==1 ) break;
                matrix[j][guards[i][1]]=2;
            }
            for(int j= guards[i][0]+1;j<m;j++){
                if(matrix[j][guards[i][1]]==2) continue;
                if(matrix[j][guards[i][1]]==1 ) break;
                matrix[j][guards[i][1]]=2;
            }
        }
        for(int i=0;i<m;i++)
            for (int j=0;j<n;j++){
                if(matrix[i][j]==0) count++;
            }
        return count;
    }
}
