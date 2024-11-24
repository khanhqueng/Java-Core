package improveAlgo.Daily;

public class RotateBox {
    public char[][] rotateTheBox(char[][] box) {
        char[][] result= new char[box[0].length][box.length];
        for(int i=0;i<box.length;i++){
            int r=box[0].length-1, l=box[0].length-2;
            while(l>=0 && r>=0){
                if(box[i][r]!='.') {
                    r--;
                    continue;
                }
                if(l<r && box[i][l]=='#'){
                    box[i][r]=box[i][l];
                    box[i][l]='.';
                    r--;
                    l--;
                    continue;
                }
                if(l<r && box[i][l]=='*'){
                    l--;
                    r=l;
                    continue;
                }
                if(box[i][l]=='.') {
                    l--;
                    continue;
                }
                l--;
            }
        }
        for(int i=0;i<box.length;i++)
            for (int j=0;j<box[0].length;j++){
                result[j][box.length-1-i]=box[i][j];
            }
        return result;
    }
}
