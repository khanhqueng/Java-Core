package improveAlgo.ZigzagConversion;

import improveAlgo.set.Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        System.out.println(convert("PAYPALISHIRING", 4));
    }
    public static String convert(String s, int numRows) {
        if(numRows==1) return s;
        char[] a= s.toCharArray();
        StringBuilder result= new StringBuilder();
        List<List<Character>> matrix= new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            matrix.add(new ArrayList<>());
        }
        boolean flag= false;
        int k=0;
        for(int sizeOfa=0;sizeOfa<a.length;sizeOfa++){
            if(flag==false){
                matrix.get(k++).add(a[sizeOfa]);
                if(k ==numRows-1) {
                    flag= true;
                    continue;
                }
            }
            if(flag==true){
                matrix.get(k--).add(a[sizeOfa]);
                if(k ==0) {
                    flag= false;
                }
            }

        }
        for(List<Character> list: matrix){
            for (Character c: list){
                result.append(c);
            }
        }
        return result.toString();
    }
}
