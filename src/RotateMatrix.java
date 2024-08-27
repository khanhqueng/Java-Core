import java.util.List;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] result= new int[][]{{1,2,3,8}, {4,5,6,7}, {7,8,9,10},{8,5,3,4}};
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        solution(result);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void solution(int[][] list){
        int size= list[0].length;

        for(int i=0;i<size-i;i++){

            for(int j=i;j<size-i-1;j++){
                int temp = list[i][j];
                // 741
                list[i][j]= list[size-1-j][i];
                // 789
                list[size-1-j][i]= list[size-1-i][size-1-j];
                //
                list[size-1-i][size-1-j]= list[j][size-1-i];
                list[j][size-1-i]= temp;
            }
        }
    }
}

