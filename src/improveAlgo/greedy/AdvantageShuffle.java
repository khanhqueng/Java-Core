package improveAlgo.greedy;

import java.util.*;

public class AdvantageShuffle {
    public static void main(String[] args){
        System.out.println(advantageCount(new int[]{718967141,189971378,341560426,23521218,339517772}, new int[]{967482459,978798455,744530040,3454610,940238504}));

    }
    public static int[] advantageCount(int[] nums1, int[] nums2) {
        Map<Integer,Stack<Integer>> map = new HashMap<>();
        Arrays.sort(nums1);
        List<Integer> missing = new ArrayList<>();
        int[] sortedNums2= Arrays.stream(nums2).sorted().toArray();
        int i=0,j=0;
        List<Integer> result= new ArrayList<>();
        while (i<sortedNums2.length && j<sortedNums2.length) {
            if(nums1[i]>sortedNums2[j]){
                Stack<Integer> value= map.getOrDefault(sortedNums2[j], new Stack<>());
                value.add(nums1[i]);
                map.put(sortedNums2[j], value);
                i++;
                j++;
            }
            else {
                missing.add(nums1[i]);
                i++;
            }
        }
        if(j!= sortedNums2.length){
            int index=0;
            for(int k=j;k<sortedNums2.length;k++){
                Stack<Integer> value= map.getOrDefault(sortedNums2[k], new Stack<>());
                value.add(missing.get(index++));
                map.put(sortedNums2[k], value);
            }
        }
        for(int inter : nums2){
            result.add(map.get(inter).pop());
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
