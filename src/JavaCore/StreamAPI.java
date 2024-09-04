package JavaCore;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class StreamAPI {
    public static void main(String[] args) {
        objectStream();
        primitiveStream();
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
    }
}
