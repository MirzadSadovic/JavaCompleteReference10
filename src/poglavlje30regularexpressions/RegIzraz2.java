package poglavlje30regularexpressions;

//upotreba metode find() za pronalaženje podsekvence
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegIzraz2 {

    public static void main(String[] args) {

        Pattern sablon = Pattern.compile("Java");
        Matcher poklapanje = sablon.matcher("Java 9");

        System.out.println("U sekvenci Java 9 trazimo podsekvencu Java.");

        if (poklapanje.find()) {
            System.out.println("Podsekvenca pronađena");
        } else {
            System.out.println("Pdsekvenca nije pronađena");
        }
    }
}
