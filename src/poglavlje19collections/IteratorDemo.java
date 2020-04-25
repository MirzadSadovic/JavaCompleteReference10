package poglavlje19collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

    public static void main(String[] args) {

        //Izrada dinamickog niza(ArrayList)
        ArrayList<String> arrayList = new ArrayList<String>();
        
        //Dodavanje elemenata dinamickom nizu
        arrayList.add("C");
        arrayList.add("A");
        arrayList.add("E");
        arrayList.add("B");
        arrayList.add("D");
        arrayList.add("F");
        
        //Prikazivanje dinamičkog niza, ali pomoću Iteratora.
        System.out.println("Prvobitni sadržaj dinamičkog niza arrayList: ");
        Iterator<String> itr = arrayList.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        
        //Mijenjanje objekata kojima se pristupa pomoću Iteratora.
        ListIterator<String> listItr = arrayList.listIterator();
        while(listItr.hasNext()){
            String element = listItr.next();
            listItr.set(element + "+");
            
        }
        System.out.println("Izmjenjenii sadržaj dinamičkog niza arrayList: ");
        itr = arrayList.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        
        //A sada prikazivanje sadržaja liste obrnutim redosljedom.
        System.out.println("Izmjenjena lista obrnutim redosljedom: ");
        while(listItr.hasPrevious()){
            String element = listItr.previous();
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
