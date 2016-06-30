package liang;

/**
 * Created by ilyarudyak on 6/30/16.
 */
public class TaskThreadDemo {

    public static void printChar(char c, int t) {
        for (int i = 0; i < t; i++) {
            System.out.print(c + " ");
        }
    }

    public static void printNum(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(i % 10 + " ");
//            if ( i % 10 == 0 ) {
//                Thread.yield();
//            }

        }
    }

    public static void main(String[] args) throws InterruptedException {

        // Create threads
        Thread thread1 = new Thread( () -> printChar('-', 100) );
        Thread thread2 = new Thread( () -> printChar('X', 100) );
        Thread thread3 = new Thread( () -> printNum(500) );

//        thread3.setPriority(Thread.MAX_PRIORITY);

        // Start threads
        thread1.start();
        thread2.start();
        thread2.join();
        thread3.start();

    }
}
