package poglavlje6klase.metode;

//Korištenje metode sa parametrima
class Kutija2 {
    double sirina;
    double visina;
    double dubina;

    double zapremina() {
        return sirina * visina * dubina;
    }

    //Inicijalizuje dimenzije kutije
    void postaviDimenzije(double s, double v, double d) {
        sirina = s;
        visina = v;
        dubina = d;
    }
}

public class Kutija5Demo {

    public static void main(String[] args) {

        Kutija2 mojaKutija1 = new Kutija2();
        Kutija2 mojaKutija2 = new Kutija2();
        double zapremina;
        
        //inicijalizovanje svake kutije
        mojaKutija1.postaviDimenzije(10, 20, 15);
        mojaKutija2.postaviDimenzije(3, 6, 9);
        
        zapremina = mojaKutija1.zapremina();
        System.out.println(zapremina);
        
        zapremina = mojaKutija2.zapremina();
        System.out.println(zapremina);
    }
}
