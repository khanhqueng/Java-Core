package improveAlgo.Daily;

public class BestSightSeeing {
    public int maxScoreSightseeingPair(int[] values) {
        int max=values[0];
        int result=0;
        for(int i=1;i<values.length;i++){
            if(values[i]-i+max>result)
                result= values[i]-i+max;
            if(values[i]+i>max){
                max= values[i]+i;
            }
        }

        return result;
    }
}
