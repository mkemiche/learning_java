package multithreading;

/**
 * @author mkemiche
 * @created 19/04/2021
 */
public class Exercise2 {
    public static void main(String[] args) throws InterruptedException {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                for (int i = 1; i <= 5; i++) {
                    try {
                        Thread.sleep(1000);
                        System.out.println(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t1 = new Thread(r, "My First Thread");
        Thread t2 = new Thread(r,"My Second Thread");
        Thread t3 = new Thread(r,"My Third Thread");
        t1.start();
        t2.start();
        t3.start();

        t2.join(1000);
        t3.join(1000);


    }
}
