package improveAlgo.Daily;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaximumPassRaio {
    public static void main(String[] args) {

        System.out.println(maxAverageRatio(new int[][]{{1,2}, {3,5}, {2,2}}, 2));
    }
    public static double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> maxClass = new PriorityQueue<>((p1, p2) -> Double.compare(((double)(p2[0] + 1) / (p2[1] + 1)) - ((double)p2[0] / p2[1]), ((double)(p1[0] + 1) / (p1[1] + 1)) - ((double)p1[0] / p1[1])));
        maxClass.addAll(Arrays.asList(classes));
        int[] firstMax= maxClass.poll();
        firstMax[0]= firstMax[0]+1;
        firstMax[1]= firstMax[1]+1;
        maxClass.add(firstMax);
        extraStudents--;
        while(extraStudents>0){
            int[] max= maxClass.poll();
            max[0]= max[0]+1;
            max[1]= max[1]+1;
            maxClass.add(max);
            extraStudents--;
        }
        double result=0;
        for(int[] i: maxClass){
            result+= (double) i[0] /i[1];
        }
        return result/classes.length;
    }
}
