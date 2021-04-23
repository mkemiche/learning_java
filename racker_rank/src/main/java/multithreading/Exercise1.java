package multithreading;

/**
 * @author mkemiche
 * @created 19/04/2021
 */
public class Exercise1 {

    public static void main(String[] args) {
        Runnable r = () -> {
            for (int i = 1; i <= 4; i++) {
                System.out.println(i);

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }

}
