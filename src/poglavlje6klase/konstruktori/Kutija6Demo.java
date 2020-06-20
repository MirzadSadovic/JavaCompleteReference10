package poglavlje6klase.konstruktori;

class KutijaSaKonstruktorom {

    double sirina;
    double visina;
    double dubina;

    //Konstruktor klase kutija
    public KutijaSaKonstruktorom() {
        System.out.println("Konstruišem objekat klase Kutija sa konstruktorom");
        sirina = 10;
        visina = 10;
        dubina = 10;
    }

    double zapremina() {
        return sirina * visina * dubina;
    }
}

public class Kutija6Demo {
    public static void main(String[] args) {
        KutijaSaKonstruktorom kutija1 = new KutijaSaKonstruktorom();
        KutijaSaKonstruktorom kutija2 = new KutijaSaKonstruktorom();
        double zapremina;
        
        zapremina = kutija1.zapremina();
        System.out.println(zapremina);
        
        zapremina = kutija2.zapremina();
        System.out.println(zapremina);
    }
}
