package poglavlje29streamAPI;

import java.util.*;
import java.util.stream.*;


public class StreamDemo5 {

    public static void main(String[] args) {
        ArrayList<ImeTelefonEmail> mojaLista = new ArrayList<>();
        mojaLista.add(new ImeTelefonEmail("Mirzad", "555-5555", "Mirzad@Sadovic.com"));
        mojaLista.add(new ImeTelefonEmail("Elma", "555-4444", "Elma@Sadovic.com"));
        mojaLista.add(new ImeTelefonEmail("Uma", "555-3333", "Uma@Sadovic.com"));
        System.out.println("Izvorne vrijednosti u mojaLista: ");
        mojaLista.stream().forEach((a) -> {
            System.out.println(a.ime + " " + a.brojTel + " " + a.email);
        });
        System.out.println();

        //Preslikava samo imena i brojeve u nov tok
        Stream<ImeTelefon> imeTel = mojaLista
                .stream()
                .map((a) -> new ImeTelefon(a.ime, a.brojTel));
        
        System.out.println("Lista imena i brojeva telfona ");
        imeTel.forEach((a)->{
            System.out.println(a.ime + " "+ a.brojTel);
        });
    }
}
