package Teko;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Character[] result= new Character[]{'A','B','C','D','E'};
        List<Integer> input= List.of(4, 4);
        music(input, result);
    }
    public static void music(List<Integer> input, Character[] result){
        for(Integer i: input){
            buttonFunction(i, result);
        }
    }
    public static void buttonFunction(int num, Character[] result){
        switch (num){
            case 1:{
                Character first = result[0];
                for(int i=1;i<result.length;i++){
                    result[i-1]= result[i];
                }
                result[result.length-1]=first;
                break;
            }
            case 2:{
                Character last = result[result.length-1];
                for(int i=result.length-1;i>=1;i--){
                    result[i]= result[i-1];
                }
                result[0]=last;
                break;
            }
            case 3:{
                Character temp = result[0];
                result[0] = result[1];
                result[1] = temp;
                break;
            }
            case 4:{
                System.out.println(Arrays.toString(result));
                break;
            }
        }
    }
}
