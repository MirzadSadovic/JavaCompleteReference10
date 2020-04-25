package poglavlje11multithreding.implementingrunnable;

//Izrada nove niti implementacijom interfejsa Runnable
public class NewThread implements Runnable {

    Thread t;

    public NewThread() {
        t = new Thread(this, "Demonstarcioni Thread");
        System.out.println("Child thread: " + t);
    }

    @Override
    public void run() { //Ulazna tačka druge niti
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child prekinuta");
        }
        System.out.println("Exiting child thread.");
    }

}
