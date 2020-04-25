package poglavlje19collections;

import java.util.Properties;
import java.util.Set;


public class PropertiesDefaultDemo {
    public static void main(String[] args) {
        Properties propertiesDefault = new Properties();
        propertiesDefault.setProperty("Florida", "Tallahasse");
        propertiesDefault.setProperty("Wisconsin", "Madison");
        
        Properties gradovi = new Properties(propertiesDefault);
        
        gradovi.setProperty("Ilinois", "Springfield");
        gradovi.setProperty("Missouri", "Jefferson City");
        gradovi.setProperty("Washington", "Olimpia");
        gradovi.setProperty("California", "Sacramento");
        gradovi.setProperty("Indiana", "Indianapolis");
        
        //Formiranje skupa čiji su elementi ključevi (svojstva)
        Set<?> drzave = gradovi.keySet();
        
        //Prikazivanje svih drzava i glavnih gradova
        for(Object ime : drzave){
            System.out.println("Glavni grad države " + ime + " je " + gradovi.getProperty((String) ime) + ".");
        }
        System.out.println();
        
        //Trazenje drzave koja nije na listi....Zadavanje podrazumjevane vrijednosti.
        String str = gradovi.getProperty("Florida");
        System.out.println("Glavni grad države Florida je " + str + ".");
        
    }
}
