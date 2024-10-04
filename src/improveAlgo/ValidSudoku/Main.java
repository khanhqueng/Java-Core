package improveAlgo.ValidSudoku;

public class Main {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!isValidHorizon(board[i][j], i,j,board) || !isValidVertical(board[i][j], i,j,board)
                            || !isValidSubMatrix(board[i][j],i,j,board)){
                        return false;
                    }
                }

            }
        }
        return true;
    }
    public boolean isValidVertical(char num, int x,int y, char[][] board){
        for(int i=0;i<9;i++){
            if(i!=x && board[i][y]==num) return false;
        }
        return true;
    }
    public boolean isValidHorizon(char num, int x,int y, char[][] board){
        for(int i=0;i<9;i++){
            if(i!=y && board[x][i]==num) return false;
        }
        return true;
    }
    public boolean isValidSubMatrix(char num, int x,int y, char[][] board){
        int start= x/3;
        int end= y/3;
        for(int i=start*3;i<start*3+3;i++){
            for(int j=end*3;j<end*3+3;j++){
                if((i!=x || j!=y) && board[i][j]==num) return false;
            }
        }
        return true;
    }
}
