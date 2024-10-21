package NAB;

public class Task2 {
    public static void main(String[] args) {

    }
    public int solution(String S) {
        // Implement your solution here
        int[] person= new int[S.length()+1];
        int count= 0;
        if(S.length()==1) return 1;
        for(int i=0;i<S.length();i++){
            if(i==0){
                if(S.charAt(i)=='<' || S.charAt(i)=='^' || S.charAt(i)== 'v'){
                    count++;
                    person[i]=1;
                }
            }
            else if(S.charAt(i)=='^' || S.charAt(i)== 'v'){
                count++;
                person[i]=1;
            }
            else if(S.charAt(i)=='<'){
                if(person[i-1]==1){
                    count++;
                    person[i]=1;
                }
            } else if (S.charAt(i)=='>') {
                if(i==S.length()-1) count++;
            }

        }
        return count;
    }
}
