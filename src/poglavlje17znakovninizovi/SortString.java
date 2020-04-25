package poglavlje17znakovninizovi;

//"Bubble sort" algoritam nad Stringom

public class SortString {
    static String niz[] = {"Došlo", "je", "vrijeme", "da", "svi", "dobri", "ljudi", "pomognu", "svojoj", "zemlji"};

    public static void main(String[] args) {
        for (int j = 0; j < niz.length; j++) {
            for (int i = j + 1; i < niz.length; i++) {
                if (niz[i].compareTo(niz[j]) < 0) {
                    String t = niz[j];
                    niz[j] = niz[i];
                    niz[i] = t;
                }
            }
            System.out.println(niz[j]);
        }
    }
}
