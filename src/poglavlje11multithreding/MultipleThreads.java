package poglavlje11multithreding;

public class MultipleThreads implements Runnable {

    String name;  // ime niti
    Thread t;

    public MultipleThreads(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
    }

    //Ulazna tacka niti

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }

}
