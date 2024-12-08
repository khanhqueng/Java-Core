package improveAlgo.Daily;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindChampion {
    public int findChampion(int n, int[][] edges) {
        List<Integer> teams = new ArrayList<>();
        for(int i=0;i<n;i++){
            teams.add(i);
        }
        for( int i=0;i<edges.length;i++){
            teams.remove(Integer.valueOf(edges[i][1]));
        }
        return (teams.size()>1) ? -1 : teams.getFirst();
    }
}
