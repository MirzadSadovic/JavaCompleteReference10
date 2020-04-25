package poglavlje19collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        
        //Izrada ArrayList
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Početna lista veličine list al: " + al.size());
        
        //Dodavanje elemenata listi
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Veličina liste ali poslije dodavanja elemenata: " + al.size());
        
        //Prikazivanje liste
        System.out.println("Sadržaj liste al: " + al);
        
        //Uklanjanje elemenata sa liste.
        al.remove("F");
        al.remove(2);
        System.out.println("Veličina liste poslije uklanjanja elemenata: " + al.size());
        
        //Prikazivanje liste
        System.out.println("Sadržaj liste al: " + al);
    }
}
