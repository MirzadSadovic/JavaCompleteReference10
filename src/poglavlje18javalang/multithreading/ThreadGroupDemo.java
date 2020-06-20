package poglavlje18javalang.multithreading;

//Ilustracije upotrebe grupa programskih niti

public class ThreadGroupDemo {

    public static void main(String[] args) {
        ThreadGroup grupaA = new ThreadGroup("Grupa A");
        ThreadGroup grupaB = new ThreadGroup("Grupa B");

        NewThread ob1 = new NewThread("Jedan", grupaA);
        NewThread ob2 = new NewThread("Dva", grupaA);
        NewThread ob3 = new NewThread("Tri", grupaB);
        NewThread ob4 = new NewThread("Četiri", grupaB);

        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();

        System.out.println("\nEvo ispisa metode list():");
        grupaA.list();
        grupaB.list();
        System.out.println();

        System.out.println("Zausatavljanje grupe A");
        Thread threadGrupaA[] = new Thread[grupaA.activeCount()];
        grupaA.enumerate(threadGrupaA); //učitavanje niti koje čine grupu
        for (int i = 0; i < threadGrupaA.length; i++) {
            ((NewThread) threadGrupaA[i]).zaustaviNit(); //zaustavljanje pojedinačne niti
        }
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Glavna nit prekinuta");
        }
        System.out.println("Nastavljanje grupe A");
        for (int i = 0; i < threadGrupaA.length; i++) {
            ((NewThread) threadGrupaA[i]).nastaviNit();
        }
        
        //Čekanje da se niti završe
        try {
            System.out.println("Čekanje da se niti završe");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println("Izuzetak u glavnoj niti");
        }
        System.out.println("Glavna nit završava");
    }
}
