package poglavlje11multithreding;

public class MultiThreadDemo {

    public static void main(String[] args) {
        MultipleThreads mt1 = new MultipleThreads("One");
        MultipleThreads mt2 = new MultipleThreads("Two");
        MultipleThreads mt3 = new MultipleThreads("Three");

        //Start the threads.
        mt1.t.start();
        mt2.t.start();
        mt3.t.start();

        try {
            Thread.sleep(10000); // wait for others thread to end
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");

        }
        System.out.println("Main thread exiting");
    }
}
