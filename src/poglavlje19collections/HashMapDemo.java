package poglavlje19collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapDemo {
    public static void main(String[] args) {
        
        //Kreiranje HashMap
        HashMap<String, Double> hm = new HashMap<String, Double>();
        
        //Stavljanje elemenata u mapu
        hm.put("Mirzad Sadovic", 3434.34);
        hm.put("Elma Sadovic", 1378.00);
        hm.put("Uma Sadovic", -19.08);
        
        //Formiranje skupa stavki mape
        Set<Map.Entry<String, Double>> skup = hm.entrySet();
        //prikazivanje skupa
        for(Map.Entry<String, Double> me : skup){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        
        //Uplata 1000 na racun Uma Sadovic
        double stanje = hm.get("Uma Sadovic");
        hm.put("Uma Sadovic", stanje + 1000);
        
        System.out.println("Novo stanje na racunu Uma Sadovic: " + hm.get("Uma Sadovic"));
    }
}
