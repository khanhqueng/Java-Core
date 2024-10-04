package Teko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q= scanner.nextInt();
        List<Integer> list= new ArrayList<>();
        for(int i=1;i<=Q;i++){
            list.add(scanner.nextInt());
        }
        for(int i: list){
            if(isValid(i)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean isValid(int i){
        int start= (int)Math.sqrt(2* i);
        if((Math.pow(start,2) + start)==2*i) return true;
        return false;
    }
}
