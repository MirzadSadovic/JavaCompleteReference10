package poglavlje8inheritance;

public class KutijaDemo {

    public static void main(String[] args) {
        KutijaSaTezinom mojaKutija1 = new KutijaSaTezinom(10, 20, 15, 34.3);
        KutijaSaTezinom mojaKutija2 = new KutijaSaTezinom(2, 3, 4, 0.076);
        double zapremina;

        zapremina = mojaKutija1.zapremina();
        System.out.println("Zapremina mojeKutije1 je " + zapremina);
        System.out.println("Težina kutije mojaKutija1 je " + mojaKutija1.tezina);
        System.out.println();

        zapremina = mojaKutija2.zapremina();
        System.out.println("Zapremina mojeKutije2 je " + zapremina);
        System.out.println("Težina kutije mojaKutija2 je " + mojaKutija2.tezina);
    }

}
