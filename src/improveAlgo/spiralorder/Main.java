package improveAlgo.spiralorder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

    }

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int min= Math.min(m,n);
        int[][] matrix= new int[m][n];
        int start= 0;
        for(int i= min; i>=1;i-=2){
            addElementInSpiralOrder(matrix, m,n,head, start);
            start++;
            m-=2;
            n-=2;
        }
        return matrix;
    }
    public void addElementInSpiralOrder(int[][] matrix, int m, int n, ListNode current, int start){
        for(int j=start;j<n;j++){
            matrix[start][j]= current.val;

            if(current.next==null){
                current.val=-1;
            }
            else current=current.next;
        }
        for(int i=start+1;i<m-1;i++){
            matrix[i][n-1]= current.val;
            if(current.next==null){
                current.val=-1;
            }
            else current=current.next;
        }
        for(int j= n-1; j>=start;j--){
            matrix[m-1][j]=current.val;
            if(current.next==null){
                current.val=-1;
            }
            else current=current.next;
        }
        for(int i=m-1-start; i>start;i--){
            matrix[i][start]= current.val;
            if(current.next==null){
                current.val=-1;
            }
            else current=current.next;
        }

    }

}
