package poglavlje15lambda;

//Upotreba generickog funkcionalnog interfejsa sa lambda izrazima
public class GenererickiFunkcInterfeDemo {

    public static void main(String[] args) {

        //Koristi se verzija interfejsa NekaFunkcija tipa String
        NekaFunkcija<String> obrni = (str) -> {
            String rezultat = "";
            int i;

            for (i = str.length() - 1; i >= 0; i--) {
                rezultat += str.charAt(i);
            }
            return rezultat;
        };
        System.out.println("Lambda obrnuto je " + obrni.funkcija("Lambda"));
        System.out.println("Izraz obrnuto je " + obrni.funkcija("Izraz"));

        //Sada se koristi verzija interfejsa NekaFUnkcija tipa Integer
        NekaFunkcija<Integer> faktorijel = (n) -> {
            int rezultat = 1;

            for (int i = 1; i <= n; i++) {
                rezultat = i * rezultat;
            }
            return rezultat;
        };
        System.out.println("Faktorijel od 3 je " + faktorijel.funkcija(3));
        System.out.println("Faktorijel od 5 je " + faktorijel.funkcija(5));
    }
}
