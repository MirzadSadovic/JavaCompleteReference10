package poglavlje6klase;


public class KutijaDemo {

    public static void main(String[] args) {
        Kutija mojaKutija = new Kutija();
        double zapremina;

        mojaKutija.sirina = 10;
        mojaKutija.visina = 20;
        mojaKutija.dubina = 15;

        zapremina = mojaKutija.sirina * mojaKutija.visina * mojaKutija.dubina;
        System.out.println("Zapremina je " + zapremina);
    }
}
