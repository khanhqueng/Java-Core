package CodilityForNAB.FrogJmp;

public class Main {
    public static void main(String[] args) {
    }
    public int solution(int X, int Y, int D) {
        // Implement your solution here
        int stepNeeded = Y-X;
        if(stepNeeded % D==0)
            return stepNeeded/D;
        else return stepNeeded/D+1;
    }
}
