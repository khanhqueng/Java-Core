package Teko;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> permute= new ArrayList<>();
        backtrack(result,permute,N);
        result.remove(result.get(0));

        int res= result.size();
        for (List<Integer> list: result){
            for(int i=0;i< list.size();i++){
                if(list.get(i)==0){
                    int count=0;
                    for(int j=i+1;j<list.size();j++){
                        if(list.get(j)==1) count++;
                    }
                    if(count>1) {
                        res--;
                        break;
                    }
                }

            }
        }

        for(int start= N-2,end=1; start>0;end++,start--){
            res+= start*end;
        }
        System.out.println(res);

    }

    public static void backtrack(List<List<Integer>> result,List<Integer> permute, int N){
        if(permute.size()==N){
            result.add(new ArrayList<>(permute));
        }
        else {
            for (int i = 0; i <= 1; i++) {
                permute.add(i);
                backtrack(result, permute, N);
                permute.remove(permute.size()-1);
            }
        }
    }
}
