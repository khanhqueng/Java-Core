package JavaCore.Generics;

import java.util.List;

public class WildCard {
    public static void process(List<? extends Number> list){
        System.out.println(list);
        // wildcard cant add element : covariance
//        for (Number number: list){
//            list.add(3);
//        }
        // if change to Number super ? cant get element: contravariance

    }
}
