package improveAlgo.Daily;

public class MovePieceObtainString {
    public boolean canChange(String start, String target) {
        if(!start.equals(target) && start.charAt(start.length()-1)=='R') return false;
        if(!start.equals(target) && start.charAt(start.length()-1)=='L') return false;
        StringBuilder patternStart = new StringBuilder();
        StringBuilder patternTarget= new StringBuilder();
        for(int i=0;i<start.length();i++){
            if(start.charAt(i)=='L' || start.charAt(i)=='R') patternStart.append(start.charAt(i));
        }
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)=='L' || target.charAt(i)=='R') patternTarget.append(target.charAt(i));
        }
        return  (patternStart.toString().contentEquals(patternTarget));
    }
}
