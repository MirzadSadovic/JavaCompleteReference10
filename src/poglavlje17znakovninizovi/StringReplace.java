package poglavlje17znakovninizovi;

//Zamjenjivanje znakovnog podniza

public class StringReplace {

    public static void main(String[] args) {
        String org = "Ovo je proba. Ovo je, takođe.";
        String trazi = "je";
        String zamjena = "bijaše";
        String rezultat = "";
        int i;

        do {
            System.out.println(org);
            i = org.indexOf(trazi);
            if (i != -1) {
                rezultat = org.substring(0, i);
                rezultat = rezultat + zamjena;
                rezultat = rezultat + org.substring(i + trazi.length());
                org = rezultat;
            }
        } while (i != -1);
    }
}
