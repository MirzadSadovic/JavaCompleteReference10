package poglavlje30regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegIzraz3 {
    public static void main(String[] args) {
        Pattern sablon = Pattern.compile("test");
        Matcher poklapanje = sablon.matcher("test 1 2 3 test");
        
        while(poklapanje.find()){
            System.out.println("Uzorak test pronađen na indexu " + poklapanje.start());
        }
    }
}
