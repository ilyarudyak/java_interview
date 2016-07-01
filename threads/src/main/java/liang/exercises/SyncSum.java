package liang.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ilyarudyak on 7/1/16.
 */
public class SyncSum {

    private Integer sum = 0;

    private /*synchronized*/ void addSum() {
        synchronized (this) {
            sum += 1;
        }

    }

    public void buildSum(int nThreads) {

        ExecutorService executor = Executors.newFixedThreadPool(nThreads);

        for (int i = 0; i < nThreads * 100; i++) {
            executor.execute( () -> {
                synchronized (this) {
                    sum += 1;
                }
            } /*addSum()*/ );
        }

        executor.shutdown();
        while (!executor.isTerminated()) { }

        System.out.println("sum=" + sum);

    }


    public static void main(String[] args) {

        new SyncSum().buildSum(100);
    }
}
