package poglavlje19collections;

//Ilustracija upotrebe liste svojstava u obliku objekta tipa Properties

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties gradovi = new Properties();
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
        String str = gradovi.getProperty("Florida", "nepoznat");
        System.out.println("Glavni grad države Florida je " + str + ".");
    }
}
