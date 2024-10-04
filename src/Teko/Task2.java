package Teko;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberTestcase = input.nextInt();
        String layout1= input.nextLine();
        String key1= input.nextLine();
        String layout2= input.nextLine();
        String key2= input.nextLine();
        System.out.println(strangeKeyboard(layout1,key1 ));
        System.out.println(strangeKeyboard(layout2,key2));
    }
    public static int strangeKeyboard(String layout, String text){
        int result=0;
        int curr_key= layout.indexOf(text.charAt(0))+1;
        for(int i=1;i<text.length();i++){
            result+= Math.abs(curr_key-(layout.indexOf(text.charAt(i))+1));
            curr_key= layout.indexOf(text.charAt(i))+1;
        }
        return result;
    }
}
