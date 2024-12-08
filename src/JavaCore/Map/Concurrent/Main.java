package JavaCore.Map.Concurrent;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public final static int THREAD_POOL_SIZE = 10;

    public static Map<String, Integer> hashTable = null;
    public static Map<String, Integer> synchronizedMap = null;
    public static Map<String, Integer> concurrentHashMap = null;
    public static void main(String[] args) throws InterruptedException {
        Map<String,Integer> hashMap = new HashMap<>();
        calculatePerform(hashMap);
        hashTable = new Hashtable<>();
        calculatePerform(hashTable);
        // synchronizeMap will lock all collections only 1 thread can access resource
        synchronizedMap = Collections.synchronizedMap(new HashMap<String, Integer>());
        calculatePerform(synchronizedMap);
        // concurrent hash map will only lock bucket needed modify(put, remove), multiple thread can access resource
        concurrentHashMap= new ConcurrentHashMap<>();
        calculatePerform(concurrentHashMap);

    }
    public static void calculatePerform(final Map<String, Integer> testMap) throws InterruptedException {
        System.out.println("Test started for: " + testMap.getClass());
        long averageTime = 0;
        for (int i = 0; i < 10; i++) {

            long startTime = System.nanoTime();
            ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);

            for (int j = 0; j < THREAD_POOL_SIZE; j++) {
                executorService.execute(() -> {

                    for (int i1 = 0; i1 < 1000000; i1++) {
                        Integer randomNumber = (int) Math.ceil(Math.random() * 100000);

                        // Retrieve value. Only for test
                        Integer value = testMap.get(String.valueOf(randomNumber));

                        // Put value
                        testMap.put(String.valueOf(randomNumber), randomNumber);
                    }
                });
            }
            executorService.shutdown();
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
            long endTime = System.nanoTime();
            long totalTime = (endTime - startTime) / 1000000L;
            averageTime += totalTime;
            System.out.println("1M entried added/retrieved in " + totalTime + " ms");
        }
        System.out.println("For " + testMap.getClass() + " the average time is " + averageTime / 10 + " ms\n");
    }
}
