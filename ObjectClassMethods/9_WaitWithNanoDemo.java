public class WaitWithNanoDemo {

    public static void main(String[] args) throws Exception {

        Object lock = new Object();

        synchronized (lock) {
            System.out.println("Waiting...");
            lock.wait(2000, 500000);
            System.out.println("Finished");
        }
    }
}
