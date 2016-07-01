package liang;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ilyarudyak on 7/1/16.
 */
public class ConsumerProducer {

    private static Buffer buffer = new Buffer();
    private static ArrayBlockingQueue<Integer> buffer2 = new ArrayBlockingQueue<>(2);

    // An inner class for buffer
    private static class Buffer {
        private static final int CAPACITY = 5; // buffer size
        private Queue<Integer> queue = new LinkedList<>();

        // Create a new lock
        private static Lock lock = new ReentrantLock();

        // Create two conditions
        private static Condition notEmpty = lock.newCondition();
        private static Condition notFull = lock.newCondition();

        public void write(int value) {
            lock.lock(); // Acquire the lock
            try {
                while (queue.size() == CAPACITY) {
                    System.out.println("Wait for notFull condition");
                    notFull.await();
                }

                queue.add(value);
                notEmpty.signal(); // Signal notEmpty condition
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } finally {
                lock.unlock(); // Release the lock
            }
        }

        public int read() {
            int value = 0;
            lock.lock(); // Acquire the lock
            try {
                while (queue.isEmpty()) {
                    System.out.println("\t\t\tWait for notEmpty condition");
                    notEmpty.await();
                }

                value = queue.remove();
                notFull.signal(); // Signal notFull condition
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            } finally {
                lock.unlock(); // Release the lock
                return value;
            }
        }
    }

    public static void main(String[] args) {
        // Create a thread pool with two threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute( () -> {
            try {
                Integer i = 1;
                while (true) {
                    System.out.println("Producer writes " + i);
//                    buffer.write(i++); // Add a value to the buffer
                    buffer2.put(i++);
                    // Put the thread into sleep
                    Thread.sleep((int)(Math.random() * 10000));
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
        executor.execute( () -> {
            try {
                while (true) {
//                    System.out.println("\t\t\tConsumer reads " + buffer.read());
                    System.out.println("\t\t\tConsumer reads " + buffer2.take());
                    // Put the thread into sleep
                    Thread.sleep((int)(Math.random() * 10000));
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
        executor.shutdown();
    }
}




















