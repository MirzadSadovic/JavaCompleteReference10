package poglavlje19collections;

//Ilustracija upotrebe nekoliko algoritama

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        
        //Pravljenje i inicijalizacija linked list
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);
        
        //Izrada komparatora za obrnut redosljed elemenata
        Comparator<Integer> r = Collections.reverseOrder();
        
        //Uređivanje liste pomoću komparatora
        Collections.sort(ll, r);
        
        System.out.print("Lista uređena naopako: ");
        for(int i : ll){
            System.out.print(i + " ");
        }
        System.out.println();
        
        //Nasumično miješanje sadrzaja liste
        Collections.shuffle(ll);
        
        //Prikazivanje izmješane liste
        System.out.print("Izmješana lista: ");
        for(int i : ll){
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("Najmanja vrijednost: " + Collections.min(ll));
        System.out.println("Najveća vrijednost: " + Collections.max(ll));
    }
}
