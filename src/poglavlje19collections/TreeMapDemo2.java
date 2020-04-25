
package poglavlje19collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class TreeMapDemo2 {
    
        public static void main(String[] args) {

        //Izrada mape u obliku stabla
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComparator());

        //Smještamo elemente u mapu
        tm.put("Mirzad Sadovic", 3434.34);
        tm.put("Elma Sadovic", 1378.00);
        tm.put("Uma Sadovic", -19.08);

        //Učitavanje skupa stavki
        Set<Map.Entry<String, Double>> skup = tm.entrySet();

        //Prikazivanje elemenata
        for (Map.Entry<String, Double> me : skup) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //Uplata na račun Uma Sadovic
        double stanje = tm.get("Uma Sadovic");
        tm.put("Uma Sadovic", stanje + 1000);

        System.out.println("Novo stanje na računu Uma Sadovic: " + tm.get("Uma Sadovic"));
    }
}
