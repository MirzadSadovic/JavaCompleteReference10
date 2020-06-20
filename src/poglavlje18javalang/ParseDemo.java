package poglavlje18javalang;

//Program sabira listu brojeva koje unosi korisnik. Konvertuje znakovni oblik svakog broja u tip int metodom parseInt();

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParseDemo {
    public static void main(String[] args) throws IOException {
        //Izrada objekta klase BufferedReader koji je povezan sa tokom System.in
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int zbir = 0;
        
        System.out.println("Unesite brojeve, 0 za kraj.");
        do{
            str = bufferedReader.readLine();
            try{
                i = Integer.parseInt(str);
            }catch(NumberFormatException exception){
                System.err.println("Pogrešan format" + exception);
                i = 0;
            }
            zbir += i;
            System.out.println("Tekući zbir je: " + zbir);
        }while(i != 0);
    }
}
