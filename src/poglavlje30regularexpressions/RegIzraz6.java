package poglavlje30regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegIzraz6 {
    public static void main(String[] args) {
        Pattern sablon = Pattern.compile("p.+?d");
        Matcher poklapanje = sablon.matcher("pored njega ili ispred njega");
        
        while(poklapanje.find()){
            System.out.println("Pronađeno: " + poklapanje.group());
        }
    }
}
