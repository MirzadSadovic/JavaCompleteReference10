package poglavlje19collections;

import java.util.*;

public class ArrayListToArray {

    public static void main(String[] args) {

        //Pravljenje liste tipa ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //Dodavanje elemenata na listu.
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        System.out.println("Sadržaj liste arrayList: " + arrayList);

        //Pretvaranje u niz (Array)
        Integer integerArray[] = new Integer[arrayList.size()];
        integerArray = arrayList.toArray(integerArray);

        int zbir = 0;

        //Sabiranje elemenata niza
        for (int i : integerArray) {
            zbir += i;
        }
        System.out.println("Zbir je: " + zbir);
    }
}
