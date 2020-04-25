package poglavlje20utilityclasses;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    static String in = "naslov=Java: kompletan priručnik;" 
                     + "autor=Schildt;" 
                     + "izdavač=Mikro knjiga;" 
                     + "izdanje=2018";
    
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in, "=;");
        
        while(st.hasMoreTokens()){
            String key = st.nextToken();
            String value = st.nextToken();
            
            System.out.println(key + "\t" + value);
        }
    }
}
