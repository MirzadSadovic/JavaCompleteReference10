package poglavlje30regularexpressions;

import java.util.regex.*;

public class RegIzraz {
    public static void main(String[] args) {
        Pattern sablon;
        Matcher poklapanje;
        boolean pronadjen;
        
        sablon = Pattern.compile("Java");
        poklapanje = sablon.matcher("Java");
        pronadjen = poklapanje.matches(); //traži poklapanje
        
        System.out.println("Ispitujemo da li se Java poklapa sa Java:");
        if(pronadjen){
            System.out.println("Da");
        }else{
            System.out.println("Ne");
        }
        System.out.println();
        
        System.out.println("Ispitujemo da li se Java poklapa sa Java 9.");
        poklapanje = sablon.matcher("Java 9"); //nova sekvenca za poređenje
        
        pronadjen = poklapanje.matches(); //trazi poklapanje
        if(pronadjen){
            System.out.println("Da");
        }else{
            System.out.println("Ne");
        }
    }
}
