package improveAlgo.greedy;

public class ValidParenthesis {
    public boolean checkValidString(String s) {
        int maxLeft=0, minLeft=0;
        for(int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case '(':{
                    maxLeft++;
                    minLeft++;
                    break;
                }
                case ')':{
                    maxLeft--;
                    minLeft--;
                    break;
                }
                case '*':{
                    maxLeft++;
                    minLeft--;
                }
            }

            if( maxLeft<0) return false;
            if(minLeft<0) minLeft=0;
        }
        return minLeft==0;
    }
}
