import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPI {
    public static void main(String[] args) {
        objectStream();
    }
    public static void primitiveStream(){

        IntStream.of(1,4,3,54).forEach(System.out::println);
        int[] b= new int[]{1,4,6,7,3,8};
        boolean n= IntStream.concat(IntStream.of(b), IntStream.of(5,6,7))
                .filter(a-> a%2==0)
                .limit(2)
                .anyMatch(c-> c== 0);
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
