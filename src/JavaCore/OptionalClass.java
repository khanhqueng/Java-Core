package JavaCore;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalClass {
    public static void main(String[] args) {
        optional();
    }
    public static void optional(){

        Optional<List<String>> string= Optional.of(Arrays.asList("Quang", "Khanh", "Pham","QUoc khanh"));
        System.out.println(string.stream()
                .flatMap(Collection::stream)
                .filter(a-> a.startsWith("Q"))
                .collect(Collectors.toList()));
        List<List<List<String>>> lists= Arrays.asList(
                Arrays.asList(Arrays.asList("Geeks", "For")),
                Arrays.asList(Arrays.asList("GeeksForGeeks", "A computer portal")),
                Arrays.asList(Arrays.asList("Java", "Programming")));
        //use flatmap to flaten nested stream
        lists.stream()
                .flatMap(Collection::stream)
                .flatMap(Collection::stream)
                .forEach(System.out::println);
        List<String> list = Arrays.asList("Geeks", "GFG", "GeeksforGeeks", "gfg");
        list.stream()
                .map(character-> character.charAt(2))
                .forEach(System.out::println);
        // if use map would be stream of streams
        list.stream()
                .flatMap(map -> Stream.of(map.charAt(2)))
                .forEach(System.out::println);

    }
}
