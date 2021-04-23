package concurrency;

/**
 * @author mkemiche
 * @created 19/04/2021
 */
public class ExerciseThree {
    static int k = 0;
    public static void main(String[] args) {
        Runnable write = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    k++;
                    System.out.println(Thread.currentThread().getName());
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable read = new Runnable() {
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

                for (int i = 0; i < 1000; i++) {
                    System.out.println(color + Thread.currentThread().getName()+ " "+ k);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(write);
        Thread t2 = new Thread(read);

        t2.start();
        t1.start();
        try {
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
