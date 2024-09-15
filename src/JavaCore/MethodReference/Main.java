package JavaCore.MethodReference;

import javax.swing.*;
import java.util.function.BiFunction;

public class Main {
    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }

    public static String appendStrings(String a, String b) {
        return a + b;
    }

    public String appendStrings2(String a, String b) {
        return a + b;
    }
    public static void main(String[] args){
        Main main= new Main();
        // lambda expressions
        System.out.println(Main.mergeThings("Quang", "Khanh", (a,b)-> a+b));
        // Reference to a static method
        System.out.println(Main.mergeThings("Hello", "Khanh", Main::appendStrings));
        // Reference to an instance method of a particular object
        System.out.println(Main.mergeThings("Khanh", "Quang", main::appendStrings2));
        // Reference to an instance method of an arbitrary object of a particular type
        System.out.println(Main.mergeThings("Khanh", "Quang", String::concat));
    }
}
