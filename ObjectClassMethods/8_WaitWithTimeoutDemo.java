public class WaitWithTimeoutDemo {

    public static void main(String[] args) throws Exception {

        Object lock = new Object();

        synchronized (lock) {
            System.out.println("Waiting for 2 seconds...");
            lock.wait(2000);
            System.out.println("Done waiting");
        }
    }
}
