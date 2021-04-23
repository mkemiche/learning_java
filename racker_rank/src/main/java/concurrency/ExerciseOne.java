package concurrency;

/**
 * @author mkemiche
 * @created 19/04/2021
 */
public class ExerciseOne {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
            //    synchronized (this) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println(Thread.currentThread().getName() + " Hello world");
                    }
              //  }
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        Thread t4 = new Thread(r);
        Thread t5 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

}
