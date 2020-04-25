package poglavlje19collections;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        //Kreiranje objekta tipa treeSet
        TreeSet<String> treeSet = new TreeSet<String>();
        
        //Dodavanje elemenata u stablo 
        treeSet.add("C");
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("E");
        treeSet.add("F");
        treeSet.add("D");
        
        System.out.println(treeSet);
        
        System.out.println(treeSet.subSet("C", "F"));
    }
}
