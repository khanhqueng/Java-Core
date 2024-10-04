package improveAlgo.Backtracking;

import JavaCore.Stringbuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterConbination {
    public List<String> letterCombinations(String digits) {
        List<String> result= new ArrayList<>();
        if(digits.isEmpty()) return result;
        Map<Character ,String> digitsToLetters= new HashMap<>();

        digitsToLetters.put('2',"abc");
        digitsToLetters.put('3',"def");
        digitsToLetters.put('4',"ghi");
        digitsToLetters.put('5',"jkl");
        digitsToLetters.put('6',"mno");
        digitsToLetters.put('7',"pqrs");
        digitsToLetters.put('8',"tuv");
        digitsToLetters.put('9',"wxyz");
        backtrack(result,new StringBuilder(),0,digits,digitsToLetters);
        return result;
    }
    public void backtrack(List<String> result,StringBuilder combinations,int index,String digits, Map<Character,String> digitsToLetters ){
        //base case
        if(index==digits.length()){
            result.add(combinations.toString());
            return;
        }
        String letters= digitsToLetters.get(digits.charAt(index));


        for(Character character: letters.toCharArray()){
            combinations.append(character);
            backtrack(result,combinations,index+1,digits,digitsToLetters);
            combinations.deleteCharAt(combinations.length()-1);
        }
    }
}
