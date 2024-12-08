package improveAlgo.Daily;

public class AddSpaceToString {
    public String addSpaces(String s, int[] spaces) {
        int inx=0;
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(inx<spaces.length && i== spaces[inx]){
                sb.append(" ").append(s.charAt(i));
                inx++;
            }
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
