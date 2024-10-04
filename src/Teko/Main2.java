package Teko;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        Map<Integer, List<Character>> keyboard= new HashMap<>();
        keyboard.put(2, List.of('a','b','c'));
        keyboard.put(3, List.of('d','e','f'));
        keyboard.put(4, List.of('g','h','i'));
        keyboard.put(5, List.of('j','k','l'));
        keyboard.put(6, List.of('m','n','o'));
        keyboard.put(7, List.of('p','q','r','s'));
        keyboard.put(8, List.of('t','u','v'));
        keyboard.put(9, List.of('w','x','y','z'));
        keyboard.put(0, List.of(' '));
        Integer curr_key=-1;
        int result=0;
        for(Integer integer: keyboard.keySet()){
            if(keyboard.get(integer).contains(input.charAt(0))){
                curr_key= integer;
                result+=keyboard.get(integer).indexOf(input.charAt(0))+1;
                break;
            }

        }

        for(int i=1;i<input.length();i++){
            if(keyboard.get(curr_key).contains(input.charAt(i))){
                result+=2;
                result+= keyboard.get(curr_key).indexOf(input.charAt(i))+1;
                continue;
            }
            for(Integer integer: keyboard.keySet()){
                if(keyboard.get(integer).contains(input.charAt(i))){
                    result+=keyboard.get(integer).indexOf(input.charAt(i))+1;
                    curr_key= integer;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
