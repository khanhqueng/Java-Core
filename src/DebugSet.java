import java.util.*;

public class DebugSet {
    public static void main(String[] args) {
        solution();
    }
    public static void solution() {
        // write your code in Java SE 8
        // learn all implementation of set
        Set<Integer> set= new TreeSet<>((Comparator<Integer>) (o1, o2) -> o1-o2).reversed();
        set.add(13); set.add(2);  set.add(4); set.add(7);
        Set<Integer> set2= new HashSet<>();
        set2.add(13); set2.add(2); set2.add(4); set2.add(7);
        for(int i: set){
            System.out.println(i);
        }
        for (int i: set2){
            System.out.println(i);
        }
        Map<Integer,Integer> map= new HashMap<>();

    }
}
