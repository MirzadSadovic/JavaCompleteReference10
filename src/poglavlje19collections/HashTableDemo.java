package poglavlje19collections;

//Ilustracija upotrebe klase HashTable
import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {
        Hashtable<String, Double> stanje = new Hashtable<>();

        Enumeration<String> imena;
        String str;
        double st;

        stanje.put("Mirzad Sadovic", 3434.34);
        stanje.put("Elma Sadovic", 1378.00);
        stanje.put("Uma Sadovic", -19.08);

        //Prikazivanje stanja svih računa u Hash tabeli.
        imena = stanje.keys();
        while(imena.hasMoreElements()){
            str = imena.nextElement();
            System.out.println(str + ": " + stanje.get(str));
        }
        System.out.println();
        
        //Uplata na račun Uma Sadović
        st = stanje.get("Uma Sadovic");
        stanje.put("Uma Sadovic", st + 1000);
        System.out.println("Novo stanje računa Uma Sadovic: " + stanje.get("Uma Sadovic"));
    }
}
