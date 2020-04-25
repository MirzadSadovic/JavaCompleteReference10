package poglavlje30regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegIzraz7 {
    public static void main(String[] args) {
        Pattern sablon = Pattern.compile("[a-z]+"); //Pronalazi sve rijeci napisane malim slovom
        Matcher poklapanje = sablon.matcher("ovo je mali test");
        while(poklapanje.find()){
            System.out.println("Pronađeno: " + poklapanje.group());
        }
    }
}
