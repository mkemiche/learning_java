package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author mkemiche
 * @created 19/04/2021
 */
public class ExerciseTwo {
    static AtomicInteger ai = new AtomicInteger(0);
    public static void main(String[] args) {


        Runnable r = new Runnable() {
            @Override
            public void run() {
                String color;
                switch (Thread.currentThread().getName()) {
                    case "Thread-2":
                        color = ThreadColor.ANSI_RED;
                        break;
                    case "Thread-1":
                        color = ThreadColor.ANSI_CYAN;
                        break;
                    default:
                        color = ThreadColor.ANSI_GREEN;
                }

//                Solution 1 using synchronized proces
                int k = 0;
                synchronized (this) {
                    for (int i = 0; i < 1000000; i++) {
                        k++;
                        System.out.println(color + Thread.currentThread().getName() + " k = :" + k);
                    }
                }
                //solution Two using AtomicInteger
//                for (int i = 0; i < 10000; i++) {
//                    int k = ai.incrementAndGet();
//                    System.out.println(color + Thread.currentThread().getName() + " k = :" + k);
//                }
            }
        };


        Thread t1 = new Thread(r, "Thread-1");
        Thread t2 = new Thread(r, "Thread-2");

        t1.start();
        t2.start();


    }

}
