package poglavlje8inheritance;

public class ReferenceDemo {

    public static void main(String[] args) {
        KutijaSaTezinom kutijaSaTezinom = new KutijaSaTezinom(3, 5, 7, 8.37);
        Kutija kutija = new Kutija();
        double zapremina;

        zapremina = kutijaSaTezinom.zapremina();
        System.out.println("Zapremina kutijeSaTezinom  je " + zapremina);
        System.out.println("Težina kutijeSaTezinom je " + kutijaSaTezinom.tezina);
        System.out.println();
        
        //Dodjeljivanje reference na objekat tipa KutijaSaTezinom referentnoj promjenljivoj koja predtavlja
        //objekat tipa Kutija
        kutija = kutijaSaTezinom;
        
        zapremina = kutija.zapremina(); //ovo je uredu jer je metoda zapremina() definisana u klasi Kutija
        System.out.println("Zapremina kutije kutija je " + zapremina);
        
        //System.out.println("Tezina kutije kutija je " + kutija.tezina); //Pogresno, objekat kutija nema clan tezina
    }
}
