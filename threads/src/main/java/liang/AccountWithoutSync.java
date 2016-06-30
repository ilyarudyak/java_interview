package liang;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ilyarudyak on 6/30/16.
 */
public class AccountWithoutSync {

    private static Account account = new Account();

    private /* synchronized */ static void addDollar() {
        synchronized (account) {
            account.deposit(1);
        }

    }

    public static void supplyAccount() {

        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            executor.execute( () -> addDollar() );
        }

        executor.shutdown();

        // Wait until all tasks are finished
        while (!executor.isTerminated()) {
        }

        System.out.println("What is balance? " + account.getBalance());
    }

    // An inner class for account
    private static class Account {
        private int balance = 0;

//        private static Lock lock = new ReentrantLock();

        public int getBalance() {
            return balance;
        }

        public /* synchronized */ void deposit(int amount) {

//            lock.lock();

            int newBalance = balance + amount;

            // This delay is deliberately added to magnify the
            // data-corruption problem and make it easy to see.
            try {
                Thread.sleep(5);

                balance = newBalance;
            } catch (InterruptedException ex) {

            } finally {
//                lock.unlock();
            }

        }
    }


    public static void main(String[] args) {

        supplyAccount();
    }
}




















