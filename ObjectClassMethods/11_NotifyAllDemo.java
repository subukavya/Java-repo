/*
 * Topic: notifyAll() in Java
 *
 * notifyAll() is a method of Object class.
 * It wakes up ALL threads that are waiting on the same object lock.
 *
 * Important Rules:
 * - wait(), notify(), notifyAll() must be called inside synchronized block.
 * - Thread must own the object's monitor (lock).
 * - wait() releases the lock.
 * - notifyAll() wakes all waiting threads.
 */

public class NotifyAllDemo {

    public static void main(String[] args) {

        // Shared lock object (monitor)
        Object lock = new Object();

        // Task that each thread will execute
        Runnable task = () -> {

            // Thread must acquire lock before calling wait()
            synchronized (lock) {
                try {
                    System.out.println(Thread.currentThread().getName() + " is waiting...");

                    // Thread goes into WAITING state
                    // It releases the lock and waits for notification
                    lock.wait();

                    // This runs only after notifyAll() wakes the thread
                    System.out.println(Thread.currentThread().getName() + " resumed");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        // Creating two threads that will wait
        new Thread(task, "Thread-1").start();
        new Thread(task, "Thread-2").start();

        // Notifier thread
        new Thread(() -> {

            // Must acquire same lock to call notifyAll()
            synchronized (lock) {

                System.out.println("Notifier thread calling notifyAll()...");

                // Wakes up ALL threads waiting on 'lock'
                lock.notifyAll();
            }

        }).start();
    }
}
