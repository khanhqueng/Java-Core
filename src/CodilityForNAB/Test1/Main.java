package CodilityForNAB.Test1;

public class Main {
    public static void main(String[] args) {
        System.out.println( solution(0));
    }
    public static int solution(int N) {
       int maxDigitCanHave= N/9+1;
       StringBuilder result= new StringBuilder(String.valueOf(N - (maxDigitCanHave - 1) * 9));
       for(int i=1;i<maxDigitCanHave;i++){
            result.append("9");
       }
       return Integer.parseInt(String.valueOf(result));
    }
}
