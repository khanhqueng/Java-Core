package improveAlgo.MaximumDistanceInArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){

    }
    public int maxDistance(List<List<Integer>> arrays) {
        List<Integer> minEachArray = new ArrayList<>();
        List<Integer> maxEachArray= new ArrayList<>();
        for(int i=0;i< arrays.size();i++){
            minEachArray.add(arrays.get(i).get(0));
            maxEachArray.add(arrays.get(i).get(arrays.get(i).size()-1));
        }
        Integer max= Collections.max(maxEachArray);
        int arrayHaveMaxValue= maxEachArray.indexOf(max);
        minEachArray.remove(arrays.get(arrayHaveMaxValue).get(0));
        Integer min= Collections.min(minEachArray);
        int maxAccordingMaxArray= Math.abs(max-min);
        int minDeleted= arrays.get(arrayHaveMaxValue).get(0);
        int maxAfter = minDeleted;
        if(minDeleted<min){
            maxEachArray.remove(arrays.get(arrayHaveMaxValue).get(arrays.get(arrayHaveMaxValue).size()-1));
             maxAfter= Collections.max(maxEachArray);
        }
        

        return Math.max(maxAccordingMaxArray, Math.abs(maxAfter-minDeleted));
    }
}
