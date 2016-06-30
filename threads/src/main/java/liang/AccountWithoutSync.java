package liang;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ilyarudyak on 6/30/16.
 */
public class AccountWithoutSync {

    private static Account account = new Account();

    private static void addDollar() {
        account.deposit(1);
    }

    public static void supplyAccount() {

        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 1000; i++) {
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

        public int getBalance() {
            return balance;
        }

        public void deposit(int amount) {
            int newBalance = balance + amount;

            // This delay is deliberately added to magnify the
            // data-corruption problem and make it easy to see.
            try {
                Thread.sleep(5);
            }
            catch (InterruptedException ex) {
            }

            balance = newBalance;
        }
    }


    public static void main(String[] args) {

        supplyAccount();
    }
}




















