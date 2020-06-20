package poglavlje6klase.metode;

class Kutija1 {

    double sirina;
    double visina;
    double dubina;

    double zapremina() {
        return sirina * visina * dubina;
    }
}

public class Kutija4Demo {

    public static void main(String[] args) {
        Kutija1 kutija1 = new Kutija1();
        Kutija1 kutija2 = new Kutija1();
        double zapremina;

        kutija1.sirina = 10;
        kutija1.visina = 20;
        kutija1.dubina = 15;

        kutija2.sirina = 3;
        kutija2.visina = 6;
        kutija2.dubina = 9;

        zapremina = kutija1.zapremina();
        System.out.println("Zapremina kutije 1 " + zapremina);

        zapremina = kutija2.zapremina();
        System.out.println("Zapremina kutije 2 " + zapremina);
    }
}
