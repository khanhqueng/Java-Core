package JavaCore.Thread;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("Runnable is running");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread1= new MyThread();
        MyThread myThread2= new MyThread();
        // simultaneously run 2 thread
        myThread1.start();
        myThread2.start();
        // wait 2 thread complete
        myThread1.join();
        myThread2.join();
        // result not equal 2000 if not synchronized
        System.out.println( MyThread.counter.getCount());
    }
}
