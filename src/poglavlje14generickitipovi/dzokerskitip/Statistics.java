package poglavlje14generickitipovi.dzokerskitip;

//Upotreba Jokerskog argumenta
public class Statistics<T extends Number> {

    T[] brojevi; // Niz tipa Number ili njegove podklase

    //Konstruktoru se prosljeđuje referenca na niz tipa Number ili njegove podklase
    public Statistics(T[] o) {
        brojevi = o;
    }
    //Rezultat je tipa double u svim slučajevims
    double average() {
        double sum = 0.0;
        for (int i = 0; i < brojevi.length; i++) {
            sum += brojevi[i].doubleValue();
        }
        return sum / brojevi.length;
    }
    //Utvrđivanje da li su dvije vrijednosti jednake.
    //Obratite pažnju na upotrebu DŽOKERSKOG ZNAKA -> Wildcard

    boolean sameAvg(Statistics<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }

}
