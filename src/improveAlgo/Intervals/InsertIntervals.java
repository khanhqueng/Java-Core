package improveAlgo.Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertIntervals {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> inserted= new LinkedList<>(Arrays.stream(intervals).toList());
        int index=0;
        for(int i=0 ;i< intervals.length-1;i++){
            if(intervals[i][0]<= newInterval[0] && intervals[i+1][0]>=newInterval[0]){
                index= i+1;
            }
        }
        if(index==0 ){
            if(newInterval[0]>=intervals[intervals.length-1][1])
                index= intervals.length;
        }
        inserted.add(index, newInterval);
        List<int[]> merged = new ArrayList<>();
        int[] prev= inserted.getFirst();
        for(int i=1;i<inserted.size();i++){
            if(inserted.get(i)[0]<= prev[1]){
                prev[1]= Math.max(inserted.get(i)[1], prev[1]);
            }
            else{
                merged.add(prev);
                prev= inserted.get(i);
            }
        }
        merged.add(prev);
        return merged.toArray(new int[merged.size()][]);
    }
}
