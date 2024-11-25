package improveAlgo.Daily;


import java.lang.reflect.Array;
import java.util.*;

public class SlidingPuzle {
    public static void main(String[] args) {

        System.out.println(slidingPuzzle(new int[][]{{0,1,5},{4,2,3}}));
    }
    public static int slidingPuzzle(int[][] board) {
        int[][] result= new int[][]{{1,2,3},{4,5,0}};
        if(Arrays.deepEquals(board,result)) return 0;
        Queue<int[][]> queue= new LinkedList<>();
        Set<int[][]> duplicate = new TreeSet<>((a, b) -> {
            if (Arrays.deepEquals(a, b)) {
                return 0;
            }
            return 1;
        });
        queue.add(board);
        return bfs(queue,1,result,duplicate);
    }
    public static int bfs(Queue<int[][]> queue, int count, int[][] result, Set<int[][]> duplicate){
        if(duplicate.size()>=720) return -1;
        Queue<int[][]> nodes= new LinkedList<>();
        while(!queue.isEmpty()){
            int[][] board = queue.poll();
            if(board == null) continue;
            int indexX= 0;
            int indexY= 0;
            for(int i=0;i<board.length;i++){
                for (int j =0;j<board[0].length;j++){
                    if(board[i][j]==0) {
                        indexX=i;
                        indexY=j;
                        break;
                    }
                }
            }
            int[][] swapUp = Arrays.stream(board).map(int[]::clone).toArray(int[][]::new);
            int[][] swapDown = Arrays.stream(board).map(int[]::clone).toArray(int[][]::new);
            int[][] swapLeft = Arrays.stream(board).map(int[]::clone).toArray(int[][]::new);
            int[][] swapRight = Arrays.stream(board).map(int[]::clone).toArray(int[][]::new);
            if(indexX ==0){
                swapDown[indexX][indexY]=swapDown[indexX+1][indexY];
                swapDown[indexX+1][indexY]= 0;
                if(Arrays.deepEquals(swapDown,result)) return count;
                if(!duplicate.contains(swapDown)){
                    nodes.add(swapDown);
                    duplicate.add(swapDown);
                }
            }
            else {
                swapUp[indexX][indexY]=swapUp[indexX-1][indexY];
                swapUp[indexX-1][indexY]= 0;
                if(Arrays.deepEquals(swapUp,result)) return count;
                if(!duplicate.contains(swapUp)) {
                    nodes.add(swapUp);
                    duplicate.add(swapUp);
                }
            }
            if(indexY==0){
                swapRight[indexX][indexY]= swapRight[indexX][indexY+1];
                swapRight[indexX][indexY+1]= 0;
                if(Arrays.deepEquals(swapRight,result)) return count;
                if(!duplicate.contains(swapRight)) {
                    nodes.add(swapRight);
                    duplicate.add(swapRight);
                }
            }
            else if(indexY==2){
                swapLeft[indexX][indexY]= swapLeft[indexX][indexY-1];
                swapLeft[indexX][indexY-1]= 0;
                if(Arrays.deepEquals(swapLeft,result)) return count;
                if(!duplicate.contains(swapLeft)) {
                    nodes.add(swapLeft);
                    duplicate.add(swapLeft);
                }
            }
            else {
                swapRight[indexX][indexY]= swapRight[indexX][indexY+1];
                swapRight[indexX][indexY+1]= 0;
                if(Arrays.deepEquals(swapRight,result)) return count;
                if(!duplicate.contains(swapRight)) {
                    nodes.add(swapRight);
                    duplicate.add(swapRight);
                }
                swapLeft[indexX][indexY]= swapLeft[indexX][indexY-1];
                swapLeft[indexX][indexY-1]= 0;
                if(Arrays.deepEquals(swapLeft,result)) return count;
                if(!duplicate.contains(swapLeft)) {
                    nodes.add(swapLeft);
                    duplicate.add(swapLeft);
                }
            }
        }
        if(!nodes.isEmpty()){
            return bfs(nodes, count + 1, result, duplicate);
        }
        return -1;
    }
}
