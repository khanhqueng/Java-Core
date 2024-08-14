package failedTest;

import java.util.*;

import static java.util.Collections.min;

public class main {
    public static void main(String[] args){
        System.out.println("Hello");
        List<Integer> arrA= new ArrayList<>(List.of(2,1,2));
        List<Integer> arrB= new ArrayList<>(List.of(3,2,4));
       System.out.println(rearrangeStudents(arrA,arrB));
        System.out.println(arrA);
        System.out.println(arrB);
        ;
        System.out.println(findMaximumProfit(arrA,arrB));

    }
    public static long rearrangeStudents(List<Integer> arrA, List<Integer> arrB) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer integer : arrA) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }
        for (Integer integer : arrB) {
            map.put(integer, map.getOrDefault(integer, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()%2 !=0 ){
                return -1;
            }

        }
        Collections.sort(arrA, Collections.reverseOrder());
        Collections.sort(arrB, Collections.reverseOrder());
        long sum =0;
        for(int i =0;i< arrA.size();i++){
            if(!Objects.equals(arrA.get(i), arrB.get(i))){
                sum+= Math.min(arrA.get(i),arrB.get(i));
                if(arrA.get(i)-arrB.get(i)>0){
                    arrA.set(i+1,Math.min(arrA.get(i),arrB.get(i))) ;
                }
                else{
                    arrB.set(i+1,Math.min(arrA.get(i),arrB.get(i))) ;
                }
            }
        }
        return sum;

    }
    public static long findMaximumProfit(List<Integer> category, List<Integer> price) {
        // Write your code here
        Set<Integer> set = new HashSet<>();
        int count= 0;
        long profit=0;
        List<Integer> sorted= price.stream().sorted().toList();
        int k=0;
        for(int i=0;i<sorted.size();i++){
            for(int j=0;j<price.size();j++){
                if(Objects.equals(price.get(j), sorted.get(i))){
                    if(!set.contains(category.get(j))){
                        count++;
                        set.add(category.get(j));
                    }
                    profit+= (long) price.get(j) * count;



                }
            }
            k++;
        }
        return profit;
    }

}
