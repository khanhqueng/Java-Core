package improveAlgo.IntegerToRoman;

import improveAlgo.set.Set;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        System.out.println(intToRoman(3748));
    }
    public static String intToRoman(int num) {
        Map<Integer, String> symbol= new HashMap<>();
        symbol.put(1,"I");
        symbol.put(5, "V");
        symbol.put(10, "X");
        symbol.put(50, "L");
        symbol.put(100, "C");
        symbol.put(500, "D");
        symbol.put(1000, "M");
        int powers= 1000;
        StringBuilder result = new StringBuilder();
        while(powers!=0){
            int quotients= num/powers;
            switch (symbol.get(powers)){
                case "M": {
                    result.append("M".repeat(Math.max(0, quotients)));
                    break;
                }
                case "C": {
                    if(quotients== 4) result.append("CD");
                    else if(quotients== 9) result.append("CM");
                    else if(quotients / 5 >0){
                        result.append("D").append("C".repeat(Math.max(0,quotients % 5)));
                    }
                    else if(quotients /  5==0){
                        result.append("C".repeat(Math.max(0,quotients % 5)));
                    }
                    break;
                }
                case "X": {
                    if(quotients== 4) result.append("XL");
                    else if(quotients== 9) result.append("XC");
                    else if(quotients / 5 >0){
                        result.append("L").append("X".repeat(Math.max(0,quotients % 5)));
                    }
                    else if(quotients / 5==0){
                        result.append("X".repeat(Math.max(0,quotients % 5)));
                    }
                    break;
                }
                case "I": {
                    if(quotients== 4) result.append("IV");
                    else if(quotients== 9) result.append("IX");
                    else if(quotients / 5 >0){
                        result.append("V").append("I".repeat(Math.max(0,quotients % 5)));
                    }
                    else if(quotients / 5==0){
                        result.append("I".repeat(Math.max(0,quotients % 5)));
                    }
                    break;
                }
            }
            num -= quotients* powers;
            powers/=10;
        }
        return result.toString();
    }
}
