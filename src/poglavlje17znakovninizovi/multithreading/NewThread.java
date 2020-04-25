package poglavlje17znakovninizovi.multithreading;


class NewThread extends Thread {

    boolean nitStop;

    public NewThread(String ime, ThreadGroup tgOb) {
        super(tgOb, ime);
        System.out.println("Nova nit " + this);
        nitStop = false;
    }

    //Ovo je ulazna tačka za nit.
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (nitStop) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Izuzetak u " + getName());
        }
        System.out.println(getName() + " završava");
    }

    synchronized void zaustaviNit() {
        nitStop = true;
    }

    synchronized void nastaviNit() {
        nitStop = false;
        notify();
    }
}
