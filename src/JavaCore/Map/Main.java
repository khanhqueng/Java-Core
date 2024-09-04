package JavaCore.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student s1= new Student(1,"Khanh");
        Student s2= new Student(2,"Quang");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Set<Student> students= new HashSet<>();
        Set<Integer> integers= new HashSet<>(12, 0.75f);
        integers.add(4);
        integers.add(16);
        integers.add(28);
        integers.add(8);

        integers.forEach(System.out::println);
        students.add(s2);
        students.add(s1);
        Map<Student, Integer> map =new HashMap<>();
        map.put(null, null);
        map.put(s1,1);
        map.put(s2,4);
        students.forEach(System.out::println);
        System.out.println(map.toString());
    }
}
