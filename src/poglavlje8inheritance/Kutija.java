package poglavlje8inheritance;

public class Kutija {

    double sirina;
    double visina;
    double dubina;

    Kutija(Kutija object) {  //Konstruktoru se prosljeđuje objekt
        sirina = object.sirina;
        visina = object.visina;
        dubina = object.dubina;
    }

    Kutija(double s, double v, double d) { //Konstruktor koji se koristi kada su zadate sve dimenzije
        sirina = s;
        visina = v;
        dubina = d;
    }

    public Kutija() { //Konstruktor koji se koristi kada nije zadata niti jedna dimenzija
        sirina = -1;
        visina = -1;
        dubina = -1;
    }

    Kutija(double duzina) { //Konstruktor koji se koristi za izradu kocke
        sirina = visina = dubina = duzina;
    }
    double zapremina(){
        return sirina*visina*dubina;
    }
}
