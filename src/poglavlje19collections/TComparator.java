package poglavlje19collections;

import java.util.Comparator;

public class TComparator implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i, j, k;
        i = aStr.lastIndexOf(' '); //Pronalaženje indexa pocetka prezimena
        j = bStr.lastIndexOf(" "); //Pronalaženje indexa pocetka prezimena
        k = aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        if (k == 0) { //Prezimena se poklapaju(ako vrati 0, a ne +1 odnosno -1),dalje... 
            return aStr.compareToIgnoreCase(bStr); //...poređenje imena i prezimena zajedno
        } else {
            return k;
        }
    }
}
