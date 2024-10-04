package Teko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Q= scanner.nextInt();
        int numDigit= (int) Math.floor(Math.log10(Q) + 1);
        int maxComma= 0;
        long result=0;
        if(numDigit%3==0) maxComma=numDigit/3-1;
        else maxComma= numDigit/3;
        if(Q< 1000) {
            System.out.println(0);
            return;
        };
        for(int i=1;i<=maxComma;i++){
            result+= (long) (Math.min(Q,(Math.pow(1000,i+1)-1)) - Math.pow(1000,i)+1) *i;

        }
        System.out.println(result);
    }
}
