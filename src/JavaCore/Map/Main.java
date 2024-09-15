package JavaCore.Map;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student s1= new Student(1,"Khanh");
        Student s2= new Student(1,"Quang");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        for(Field field: s1.getClass().getDeclaredFields()){
            System.out.println("Field: "+ field.getName());
            System.out.println("Type: "+ field.getType());
        }

        Field privateField= s1.getClass().getDeclaredField("id");
        privateField.setAccessible(true);
        privateField.set(s1, 3 );

        System.out.println(s1);
        Set<Student> students= new HashSet<>();
        students.add(s1);
        students.add(s2);
        System.out.println(students);
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
