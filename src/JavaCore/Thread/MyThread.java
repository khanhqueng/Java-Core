package JavaCore.Thread;

import java.util.List;

public class MyThread extends Thread{
    public static Counter counter= new Counter();
    // concurrent method to count
    @Override
    public void run() {
        for(int i=0;i<1000;i++)
         counter.increment();
    }


}
