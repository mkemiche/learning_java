package concurrency;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author mkemiche
 * @created 19/04/2021
 */
public class ExerciseThreeII {
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);
    private static int k = 0;
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Write());
        Thread t2 = new Thread(new Read());

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }


    static class Write implements Runnable {

        @Override
        public void run() {
            lock.writeLock().lock();
            for (int i = 0; i < 1000; i++) {
                k++;
                System.out.println(Thread.currentThread().getName() + "write");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.writeLock().unlock();
            }
        }
    }

    static class Read implements Runnable {

        @Override
        public void run() {
            lock.readLock().lock();
            System.out.println(Thread.currentThread().getName() + " : read k : " + k);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.readLock().unlock();
            }
        }
    }
}

