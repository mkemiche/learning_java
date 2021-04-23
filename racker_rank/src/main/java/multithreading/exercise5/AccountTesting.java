package multithreading.exercise5;

import java.util.concurrent.TransferQueue;

/**
 * @author mkemiche
 * @created 19/04/2021
 */
public class AccountTesting {
    static Account ac = new Account();
    public synchronized void withdrawal(){
        System.out.println(Thread.currentThread().getName() + " is going to withdrawal");
        try {
            ac.amountWithdrawn(10);
            wait(500);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void checkAccount(){
        if(ac.getWithdrawal() > 0){
            notify();
        }else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + ac.getWithdrawal());

        }

    }

    public static void main(String[] args) {

        AccountTesting at = new AccountTesting();
            Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    at.checkAccount();
                    at.withdrawal();
                }

            }
        };

        Thread t1 = new Thread(r, "Reema");
        Thread t2 = new Thread(r, "Ranjeet");
        t1.start();
        t2.start();
    }
}
