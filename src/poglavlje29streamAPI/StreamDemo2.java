package poglavlje29streamAPI;

import java.util.*;

//Domonstracija reduce()metode
public class StreamDemo2 {

    public static void main(String[] args) {

        //Formiranje liste vrijednosti tipa Integer:
        ArrayList<Integer> mojaLista = new ArrayList<>();
        mojaLista.add(7);
        mojaLista.add(18);
        mojaLista.add(10);
        mojaLista.add(24);
        mojaLista.add(17);
        mojaLista.add(5);

        //Dva načina izračunavanja međusobnog umnoška elemenata liste mojaLista pomoću metode reduce().
        Optional<Integer> umnozakObject = mojaLista
                .stream()
                .reduce((a, b) -> a * b);
        if (umnozakObject.isPresent()) {
            System.out.println("Umnožak kao objekat tipa Optional: " + umnozakObject.get());
        }

        int umnozak = mojaLista
                .stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println("Umnožak kao vrijednost tipa int: " + umnozak);

        int parniUmnozak = mojaLista
                .stream()
                .reduce(1, (a, b) -> {
            if (b % 2 == 0) {
                return a * b;
            } else {
                return a;
            }
        });
        System.out.println(parniUmnozak);
    }
}
