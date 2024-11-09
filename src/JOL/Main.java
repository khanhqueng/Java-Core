package JOL;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

import java.beans.beancontext.BeanContextEvent;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        String a = "Hello";
        String b= new String("Hi").intern();
        String c= new String("Hi");
        out.println(c==b);
        Integer i = 5;
        double d= i.doubleValue();
    }
    public static class B {
        int a;
        int f;
        int g;
    }
}
