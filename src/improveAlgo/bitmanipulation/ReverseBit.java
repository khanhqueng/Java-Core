package improveAlgo.bitmanipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseBit {
    public static void main(String[] args) {

    }
    public static int reverseBits(int n) {
        String bit= String.valueOf(n);
        List<Character> charArrayList = new ArrayList<>(
                new String(bit)
                        .chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.toList())
        );
        charArrayList.reversed();
        String result = charArrayList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        return Integer.parseInt(result,2);
    }
}
