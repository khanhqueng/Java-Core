package improveAlgo.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class NonoverlappingInterval {
    public int eraseOverlapIntervals(int[][] intervals) {
        int result = 0;
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        int currEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (currEnd > intervals[i][0]) {
                currEnd = Math.min(currEnd, intervals[i][1]);
                result++;
            }
            else {
                currEnd= intervals[i][1];
            }
        }
        return result;
    }
}
