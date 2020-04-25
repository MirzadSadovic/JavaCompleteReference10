package poglavlje29streamAPI;

import java.util.*;
import java.util.stream.*;

//Prikazivanje više operacija koje omogućava tok
public class StreamDemo {

    public static void main(String[] args) {

        //Formira listu vrijednosti tipa Integer
        ArrayList<Integer> mojaLista = new ArrayList<>();
        mojaLista.add(7);
        mojaLista.add(18);
        mojaLista.add(10);
        mojaLista.add(24);
        mojaLista.add(17);
        mojaLista.add(5);

        System.out.println("Izvorna lista: " + mojaLista);

        //Formira tok za elemente kolekcije tipa ArrayLista.
        Stream<Integer> mojTok = mojaLista.stream();

        //Pronalazi najmanju i najveću vrijednoat na listi pomoću metoda
        //min(), max(), isPresent() i get().
        Optional<Integer> minVrijednost = mojTok.min(Integer::compare);
        if (minVrijednost.isPresent()) {
            System.out.println("Najmanja vrijednost: " + minVrijednost.get());
        }

        //Potreban je novi tok zato sto je predhodna operacija min() završna operacija koja je potrošila tok
        mojTok = mojaLista.stream();
        Optional<Integer> maxVrijednost = mojTok.max(Integer::compare);
        if (maxVrijednost.isPresent()) {
            System.out.println("Najveća vrijednost:" + maxVrijednost.get());
        }

        //Sortira tok pomoću metode sorted
        Stream<Integer> sortiranTok = mojaLista.stream().sorted();

        //Prikazuje sadržaj toka pomoću metode frEach().
        System.out.print("Sortiran tok: ");
        sortiranTok.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        //Prikazujemo samo neparne vrijednosti pomoću metode filter().
        Stream<Integer> neparneVrijednosti = mojaLista
                .stream()
                .sorted()
                .filter((n) -> (n % 2) == 1);
        System.out.print("Neparne vrijednosti: ");
        neparneVrijednosti.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        //Prikazuje samo neparne vrijednosti veće od 5. Obratite pažnju na to da su dvije operacije 
        //filtriranja nadovezane jedna za drugom.
        neparneVrijednosti = mojaLista
                .stream()
                .filter((n) -> (n % 2) == 1)
                .filter((n) -> n > 5);
        System.out.print("Neparne vrijednosti veće od 5: ");
        neparneVrijednosti.forEach((n) -> System.out.print(n + " "));
        System.out.println();

    }
}
