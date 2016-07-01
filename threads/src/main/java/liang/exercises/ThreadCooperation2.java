package liang.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by ilyarudyak on 7/1/16.
 */
public class ThreadCooperation2 {

    private static Account account = new Account();

    // An inner class for account
    private static class Account {

        private int balance = 0;

        public int getBalance() {
            return balance;
        }

        public void withdraw(int amount) {

            synchronized (account) {
                try {
                    while (balance < amount) { // We have to use loop here, not if
                        System.out.println("\t\t\tWait for a deposit");
                        account.wait();
                    }
                    balance -= amount;
                    System.out.println("\t\t\tWithdraw " + amount +
                            "\t\t" + getBalance());
                }
                catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            } // end of synchronized

        }

        public void deposit(int amount) {
            synchronized (account) {
                balance += amount;
                System.out.println("Deposit " + amount +
                        "\t\t\t\t\t" + getBalance());

                account.notifyAll();
            }
        }
    }


    public static void main(String[] args) {

        // Create a thread pool with two threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute( () -> {
            try { // Purposely delay it to let the withdraw method proceed
                while (true) {
                    account.deposit((int)(Math.random() * 10) + 1);
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        });
        executor.execute( () -> {
            while (true) {
                account.withdraw((int)(Math.random() * 10) + 1);
            }
        });
        executor.shutdown();

        System.out.println("Thread 1\t\tThread 2\t\tBalance");
    }
}


















