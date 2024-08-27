import java.util.LinkedList;
import java.util.Stack;

public class StoneWall {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{8,8,5,7,9,8,7,4,8}));
    }
    public static int solution(int[] H) {
        // write your code in Java SE 8
        Stack<Integer> stack = new Stack<>();

        int numberOfBlocks = 0;

        for(int i: H){
            while(!stack.isEmpty() && stack.peek()>i){
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek()==i){

            }
            else {
                numberOfBlocks++;
                stack.push(i);
            }
        }
        return numberOfBlocks;
    }
}
