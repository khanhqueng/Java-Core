package improveAlgo.LongestDistinctSubstring;

import JavaCore.Stringbuilder;

import java.io.IOError;
import java.io.IOException;

public class Main {
    private String a;

    public static void main(String[] args){
        System.out.print("a");
           try {
                  System.out.print("b");
                 throw new IllegalArgumentException();
               } catch (IllegalArgumentException e) {
                  System.out.print("c");
                  throw new RuntimeException("1");
               } catch (RuntimeException e) {
                  System.out.print("d");
                  throw new RuntimeException("2");
               } finally {
                  System.out.print("e");
                  throw new RuntimeException("3");
              }
    }

    public int lengthOfLongestSubstring(String s) throws IOException {
        StringBuilder sb= new StringBuilder();
        int start=0;
        int end=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(sb.indexOf(String.valueOf(s.charAt(i)))!=-1){
                max=Math.max(max,sb.length());
                sb= new StringBuilder(sb.substring(sb.indexOf(String.valueOf(s.charAt(i))) + 1));
                sb.append(s.charAt(i));
            }
            else sb.append(s.charAt(i));

        }
        return Math.max(max,sb.length());

    }
}
