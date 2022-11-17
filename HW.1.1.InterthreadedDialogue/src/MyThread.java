public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("I`m " + getName() + ". Hello!");
            }
        } catch (InterruptedException err) {
            err.getMessage();
        } finally {
            System.out.printf("%s completed\n", getName());
        }
    }
}
