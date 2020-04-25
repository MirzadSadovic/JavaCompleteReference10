package poglavlje30regularexpressions;

import java.util.regex.Pattern;


public class RegIzraz9 {
    public static void main(String[] args) {
        
        //Pronalazi rijeci napisane malim slovima
        Pattern sablon = Pattern.compile("[ ,.!]");
        
        String strArray[] = sablon.split("jedan dva,alfa9 12!kraj.");
        
        for(int i =0; i < strArray.length; i++){
            System.out.println("Sljedeća leksema: " + strArray[i]);
        }
    }
}
