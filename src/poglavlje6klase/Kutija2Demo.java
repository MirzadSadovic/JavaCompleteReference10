package poglavlje6klase;

public class Kutija2Demo {

    public static void main(String[] args) {
        Kutija mojaKutija1 = new Kutija();
        Kutija mojaKutija2 = new Kutija();
        double zapremina;

        mojaKutija1.sirina = 10;
        mojaKutija1.visina = 20;
        mojaKutija1.dubina = 15;

        mojaKutija2.sirina = 3;
        mojaKutija2.visina = 6;
        mojaKutija2.dubina = 9;

        zapremina = mojaKutija1.sirina * mojaKutija1.visina * mojaKutija1.dubina;
        System.out.println("Zapremina je " + zapremina);

        zapremina = mojaKutija2.sirina * mojaKutija2.visina * mojaKutija2.dubina;
        System.out.println("Zapremina je " + zapremina);
    }
}
