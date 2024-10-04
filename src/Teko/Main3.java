package Teko;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        for(int i=1;i<=3;i++){
            switch (i){
                case 1:{
                    for(int j=1;j<=N;j++){
                        String o1= "o".repeat(N);
                        String o2= "x".repeat(N);
                        String o3= "o".repeat(N);
                        System.out.println(o1+o2+o3);
                    }
                    break;
                }
                case 2:{
                    for(int j=1;j<=N;j++){
                        String o1= "o".repeat(N);
                        String o2= "x".repeat(N);
                        String o3= "x".repeat(N);
                        System.out.println(o1+o2+o3);
                    }
                    break;
                }
                case 3:{
                    for(int j=1;j<=N;j++){
                        String o1= "o".repeat(N);
                        String o2= "o".repeat(N);
                        String o3= "o".repeat(N);
                        System.out.println(o1+o2+o3);
                    }
                    break;
                }
            }
        }


    }
}
