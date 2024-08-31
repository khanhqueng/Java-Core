import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DebugList {
    public static void main(String[] args) {
        list();
    }
    public static void list(){
        List<String> list= new ArrayList<>();
        // if element surpass the capacity, list will replace ole array with new array with capacity +1
        list.add("hello");
        // can access random with constant time
        list.get(0);
        List<String> list1= new LinkedList<>();
        list1.add("Hi");
        // have to traverse to that element
        list1.get(0);
        List<Integer> list3= List.of(1,2,3,45);
//        list3.remove(2);
        // exception because list.of is immutable
        System.out.println(list3);
        // create a singleton object which is immutable
        List<String> list4=  Collections.emptyList();
        list4.add("hi");
    }
}
