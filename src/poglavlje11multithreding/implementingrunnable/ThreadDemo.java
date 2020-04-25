package poglavlje11multithreding.implementingrunnable;

public class ThreadDemo {

    public static void main(String[] args) {

        NewThread nt = new NewThread();  //create new thread
        
        nt.t.start(); // Start the thread

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread prekinut.");
        }
        System.out.println("Exit from Main thread");
    }

}
