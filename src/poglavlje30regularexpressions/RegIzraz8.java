package poglavlje30regularexpressions;
//Upotreba metode replaceAll().

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegIzraz8 {

    public static void main(String[] args) {

       String str = "Mirzad Elma Nusret Hadija";
       
        Pattern sablon = Pattern.compile("Mirzad.*? ");
        Matcher poklapanje = sablon.matcher(str);
        
        System.out.println("Prvobitna sekvenca " + str);
        
        str = poklapanje.replaceAll("Uma ");
        
        System.out.println("Izmjenjena sekveca " + str);
    }
}
