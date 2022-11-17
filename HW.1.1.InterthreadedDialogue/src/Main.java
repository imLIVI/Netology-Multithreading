public class Main {
    public static final int NUM_OF_THREADS = 4;

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup tg = new ThreadGroup("group 1");
        for (int i = 0; i < NUM_OF_THREADS; i++) {
            Thread thread = new Thread(tg, new MyThread());
            thread.start();
        }
        Thread.sleep(15000);
        tg.interrupt();
    }
}
