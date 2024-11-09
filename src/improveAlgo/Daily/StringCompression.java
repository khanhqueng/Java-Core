package improveAlgo.Daily;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
    public String compressedString(String word) {
        StringBuilder sb= new StringBuilder();
        int frequency= 1;
        Character curr = word.charAt(0);
        for(int i=0;i<word.length();i++){
            if(frequency==9){
                sb.append(frequency).append(String.valueOf(curr));
                frequency=1;
                continue;
            }
            if(i<word.length()-1 && word.charAt(i)==word.charAt(i+1)){
                frequency++;
                curr= word.charAt(i);
            }
            else{
                curr= word.charAt(i);
                sb.append(frequency).append(String.valueOf(curr));
                frequency=1;
            }
        }
        return sb.toString();
    }
}
