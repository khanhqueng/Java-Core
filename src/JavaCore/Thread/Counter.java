package JavaCore.Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private AtomicInteger count= new AtomicInteger(0);
    public void increment(){
        // this method will retry until update succeed -> performance can me affected
        count.incrementAndGet();
    }
    public int getCount(){
        return count.get();
    }
    public void decrement(){
        // this too
        count.getAndDecrement();
    }
}
