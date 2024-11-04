package improveAlgo.greedy;

import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int result=0;
        int i=0,j=0;
        while(i <g.length && j<s.length){
            if(g[i]<=s[j]) {
                result++;
                j++;
                i++;
            }
            else if( g[i]>s[j]){
                j++;
            }
        }
        return result;
    }
}
