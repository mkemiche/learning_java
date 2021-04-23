package multithreading;

/**
 * @author mkemiche
 * @created 19/04/2021
 */
public class Exercise3 {

    public static void main(String[] args) {

        Runnable r = () -> {

            try {
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(2000);
                    System.out.println("running thread name is : " + Thread.currentThread().getName());
                    System.out.println("running thread priority is : " + Thread.currentThread().getPriority());
                    System.out.println("=====================================");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start(); //NORME_PRIORITY BY DEFAULT
        t3.start();
    }
}
