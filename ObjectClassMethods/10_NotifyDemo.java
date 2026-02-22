public class NotifyDemo {

    public static void main(String[] args) {

        Object lock = new Object();

        new Thread(() -> {
            synchronized (lock) {
                try {
                    lock.wait();
                    System.out.println("Thread notified");
                } catch (Exception e) {}
            }
        }).start();

        new Thread(() -> {
            synchronized (lock) {
                lock.notify();
            }
        }).start();
    }
}
