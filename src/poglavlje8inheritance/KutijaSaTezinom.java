package poglavlje8inheritance;

//Proširivanje klase Kutija tako što dodajemo i težinu
public class KutijaSaTezinom extends Kutija {

    double tezina; //tezina kutije

    public KutijaSaTezinom(double s, double v, double d, double t) { //Konstruktor klase KutijaSaTezinom
        sirina = s;
        visina = v;
        dubina = d;
        tezina = t;
    }
}
