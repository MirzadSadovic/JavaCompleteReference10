package poglavlje30regularexpressions;

//Upotreba kvantifikatora
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegIzraz4 {

    public static void main(String[] args) {
        Pattern sablon = Pattern.compile("W+");
        Matcher poklapanje = sablon.matcher("W WW WWW");

        while(poklapanje.find()){
            System.out.println("Pronađeno: " + poklapanje.group());
        }
    }
}
