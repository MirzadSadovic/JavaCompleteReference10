package poglavlje29streamAPI;

import java.util.*;
import java.util.stream.*;

public class StreamDemo7 {

    public static void main(String[] args) {

        ArrayList<ImeTelefonEmail> mojaLista = new ArrayList<>();
        mojaLista.add(new ImeTelefonEmail("Mirzad", "555-5555", "Mirzad@Sadovic.com"));
        mojaLista.add(new ImeTelefonEmail("Elma", "555-4444", "Elma@Sadovic.com"));
        mojaLista.add(new ImeTelefonEmail("Uma", "555-3333", "Uma@Sadovic.com"));
        
        //Preslikava samo imena i brojeve telefona u nov tok
        Stream<ImeTelefon> imeTel = mojaLista
                .stream()
                .map((a) -> new ImeTelefon(a.ime, a.brojTel));
        
        //Pomoću metode collect() formira kolekciju tipa List imena i brojeva telefona.
        List<ImeTelefon> iList = imeTel.collect(Collectors.toList());
        System.out.println("Imena i telefonski brojevi u kolekciji tipa list:");
        for(ImeTelefon e : iList){
            System.out.println(e.ime + ": " + e.brojTel);
        }
        
        //Novi tok u koji se preslikavaju imena i brojevi telefona
        imeTel = mojaLista.stream().map((a)->new ImeTelefon(a.ime, a.brojTel));
        
        //Sada motoda collect() formira kolekciju tipa Set
        Set<ImeTelefon> iSet = imeTel.collect(Collectors.toSet());
        System.out.println("\nImena i telefonski brojevi u kolekciji tipa Set: ");
        for(ImeTelefon e : iSet){
            System.out.println(e.ime + ": " + e.brojTel);
        }
    }
}
