package poglavlje19collections;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        //Izrada LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();

        //Dodavanje elemenata u LinkedList
        linkedList.add("F");
        linkedList.add("B");
        linkedList.add("D");
        linkedList.add("E");
        linkedList.add("C");
        linkedList.addLast("Z");
        linkedList.addFirst("A");

        linkedList.add(1, "A2");
        System.out.println("Prvobitni sadržaj linkedList: " + linkedList);

        //Uklanjanje elemenata iz LinkedList
        linkedList.remove("F");
        linkedList.remove(2);
        System.out.println("Sadržaj linkedList poslije uklanjanja prvog i posljednjeg elementa: " + linkedList);
        
        //Uklanjanje prvog i posljednjeg elementa
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("linkedList poslije uklanjanja prvog i posljednjeg elementa: " + linkedList);

        //Učitavanje i zadavanje vrijednosti elemenata
        String vrijednost = linkedList.get(2);
        linkedList.set(2, vrijednost + " se promijenio");
        System.out.println("linkedList poslije mijenjanja: " + linkedList);
    }
}
