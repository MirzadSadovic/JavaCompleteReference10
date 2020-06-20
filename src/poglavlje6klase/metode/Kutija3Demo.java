package poglavlje6klase.metode;

class Kutija {
    double sirina;
    double visina;
    double dubina;

    void zapremina() {
        System.out.print("Zapremina je ");
        System.out.println(sirina * visina * dubina);
    }
}

public class Kutija3Demo {
    public static void main(String[] args) {

        Kutija kutija1 = new Kutija();
        Kutija kutija2 = new Kutija();
        
        kutija1.sirina = 10;
        kutija1.visina = 20;
        kutija1.dubina = 15;

        kutija2.sirina = 3;
        kutija2.visina = 6;
        kutija2.dubina = 9;
        
        kutija1.zapremina();
        kutija2.zapremina();
    }
}
