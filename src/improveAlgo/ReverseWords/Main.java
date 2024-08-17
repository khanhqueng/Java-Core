package improveAlgo.ReverseWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

    }
    public String reverseWords(String s) {
        String a= s.replaceAll("\\s+"," ").trim();
       List<String> words= new ArrayList<>(Arrays.asList(a.split(" ")));
       List<String> reversed=  words.reversed();
        String b= String.join(" ", reversed);
        return b;
    }
}
