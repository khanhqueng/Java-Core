package JavaCore.Generics;

import JavaCore.Generics.InheritanceGeneric.Student;
import JavaCore.Generics.InheritanceGeneric.StudentDao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        // generic type + generic method
        KeyPair<Integer, String> map= new KeyPair<>(2,new String("Khanh"));
        KeyPair<Integer, String> map2= new KeyPair<>(2,new String("Khanh"));
        System.out.println(Util.compare(map,map2));

        // bounded type
        BoundedType<Subtype> boundedType= new BoundedType<>();
        boundedType.setType(new Subtype());
        boundedType.inspect(2);

        // inheritance in generic
        Box<Number> box= new Box<>();
        box.add(20.4);
        box.add(1);

        // wild card
        List<Integer> list= Arrays.asList(1,3,4,6);
        WildCard.process(list);

        // lower bounded wildcards
        List<? super Integer> list1= new ArrayList<Number>();

        Student student = new Student(1, "gpcoder");
        StudentDao dao= new StudentDao();
        dao.insert(student);
        System.out.println(dao.toString());
    }

}
