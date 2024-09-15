package JavaCore;

import java.io.StringReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] args) {
        objectStream();
//        primitiveStream();
        parallelStream();
    }
    public static void primitiveStream(){

        IntStream.of(1,4,3,54).forEach(System.out::println);
        int[] b= new int[]{1,4,6,7,3,8};
        Integer n= IntStream.concat(IntStream.of(b), IntStream.of(5,6,8))
                .filter(a-> a%2==0)
                .limit(2)
                .findFirst().orElse(0);
//                .anyMatch(c-> c==8);
        System.out.println(n);
    }
    public static void objectStream(){

        List<String> list= List.of("Java", "C#", "C++", "PHP", "Javascript");
        String result= list.stream()
                .sorted(Comparator.comparingInt(String::length))
                        .reduce("", (a,b)-> a+ " "+ b);
//                .max(Comparator.comparingInt(String::length))
//                .ifPresent(a-> System.out.println("Hello "+ a));
//                .orElseGet(()-> "hello");

        System.out.println(result);
        List<Person> people= Arrays.asList(new Person(23,"Khanh"), new Person(34,"QUang"));
        double average= people.stream()
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();

        System.out.println(average);

        List<String> stream = Stream.of("bạn", "hãy", "like", "Fanpage", "loda","dể","cập","nhật","nhiều","hơn")
                .filter(s -> {
                    System.out.println("[filtering] " + s);
                    return s.length()>=4;
                })
                .map(s -> {
                    System.out.println("[mapping] " + s);
                    return s.toUpperCase();
                })
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("----------------------");
        System.out.println("Result:");
        stream.forEach(System.out::println);

    }
    public static void parallelStream(){
            List<String> list= Arrays.asList("1","6","8", "34");
            // should use parallel in aggregate function
            String k= list.parallelStream().reduce("hello",(a, b)-> a+b);
            System.out.println(k);
    }
}
