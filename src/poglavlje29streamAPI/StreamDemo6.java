package poglavlje29streamAPI;

import java.util.*;
import java.util.stream.*;

//Prslikavanje Streama u IntStream
public class StreamDemo6 {

    public static void main(String[] args) {
        ArrayList<Double> mojaLista = new ArrayList<>();
        mojaLista.add(1.1);
        mojaLista.add(3.6);
        mojaLista.add(9.2);
        mojaLista.add(4.7);
        mojaLista.add(12.1);
        mojaLista.add(5.0);

        System.out.println("Izvorne vrijednosti u mojaLista: ");
        mojaLista.stream().forEach((a) -> {
            System.out.println(a + " ");
        });
        System.out.println();

        //Elemente mojaLista preslikava u njihove najbliže cjelobrojne veće vrijednosti u tok tipa IntStream.
        IntStream intStream = mojaLista
                .stream()
                .mapToInt((a) -> (int) Math.ceil(a));

        System.out.println("Najbliže veće cjelobrojne vrijednosti od elemenata u mojaLista:");
        intStream.forEach((a) -> {
            System.out.println(a + " ");
        });
    }
}
