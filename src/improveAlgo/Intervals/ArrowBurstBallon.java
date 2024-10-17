package improveAlgo.Intervals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrowBurstBallon {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)-> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);  // Compare first elements
            } else {
                return Integer.compare(a[1], b[1]);  // Compare second elements if first elements are equal
            }
        });
        int count=0;
        int[] prev= new int[]{Integer.MIN_VALUE, points[0][1]};
        for(int i=1;i< points.length;i++){
            if(prev[1]>=points[i][0]){
                prev[0]= Math.max(points[i][0], prev[0]);
                prev[1]= Math.min(prev[1],points[i][1]);
            }
            else{
                count++;
                prev = new int[]{Integer.MIN_VALUE, points[i][1]};
            }
        }
        return count+1;
    }
}
