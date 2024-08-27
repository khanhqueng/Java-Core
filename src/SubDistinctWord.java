import java.util.HashSet;
import java.util.Set;

public class SubDistinctWord {
    public static void main(String[] args) {
        System.out.println(solution("phamqmuankgkhanh"));
    }
    public static int solution(String s){
        Set<Character> set= new HashSet<>();
        int count= 1;
        set.add(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                set.clear();
                count++;
                set.add(s.charAt(i));
                continue;
            }
            set.add(s.charAt(i));
        }
        return count;
    }
}
