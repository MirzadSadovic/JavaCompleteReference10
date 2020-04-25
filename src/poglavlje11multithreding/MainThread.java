package poglavlje11multithreding;

public class MainThread {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("Tekuća nit: " + t);

        t.setName("Moj thread"); //mijenja ime niti
        System.out.println("Nakon promjene imena: " + t);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Glavna nit je prekinuta");
        }
    }
}
